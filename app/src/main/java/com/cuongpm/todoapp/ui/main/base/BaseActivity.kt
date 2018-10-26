package com.cuongpm.todoapp.ui.main.base

import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by cuongpm on 9/23/18.
 */

abstract class BaseActivity : DaggerAppCompatActivity() {

    open fun updateMenu() {}

}