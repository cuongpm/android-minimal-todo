package com.cuongpm.todoapp.util.ext

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by cuongpm on 9/24/18.
 */

inline fun AppCompatActivity.addFragment(containerViewId: Int, f: () -> Fragment): Fragment? {
//    val manager = supportFragmentManager
//    val fragment = manager?.findFragmentById(containerViewId)
//    fragment?.let { return it }
    return f().apply { supportFragmentManager?.beginTransaction()?.add(containerViewId, this)?.commit() }
}

inline fun AppCompatActivity.replaceFragment(containerViewId: Int, f: () -> Fragment): Fragment? {
    return f().apply { supportFragmentManager?.beginTransaction()?.replace(containerViewId, this)?.commit() }
}