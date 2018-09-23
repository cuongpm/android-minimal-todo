package com.cuongpm.todoapp.di.module

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by cuongpm on 9/23/18.
 */

@Module
internal abstract class AppModule {

    @Binds
    internal abstract fun bindContext(application: Application): Context
}