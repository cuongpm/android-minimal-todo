package com.cuongpm.todoapp.di.module

import android.content.Context
import com.cuongpm.todoapp.AppApplication
import com.cuongpm.todoapp.di.qualifier.ApplicationContext
import dagger.Binds
import dagger.Module

/**
 * Created by cuongpm on 9/23/18.
 */

@Module
abstract class AppModule {

    @Binds
    @ApplicationContext
    abstract fun bindApplicationContext(application: AppApplication): Context

}