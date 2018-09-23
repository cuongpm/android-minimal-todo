package com.cuongpm.todoapp

import com.cuongpm.todoapp.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by cuongpm on 9/23/18.
 */

open class AppApplication : DaggerApplication() {

    lateinit var androidInjector: AndroidInjector<out DaggerApplication>

    override fun onCreate() {
        super.onCreate()

        androidInjector = DaggerAppComponent.builder().application(this).build();
    }

    public override fun applicationInjector(): AndroidInjector<out DaggerApplication> = androidInjector

}