package com.cuongpm.todoapp.di.module

import android.arch.lifecycle.ViewModelProvider
import com.cuongpm.todoapp.util.ViewModelFactory
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by cuongpm on 9/25/18.
 */

@Module
abstract class ViewModelModule {

    @Singleton
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}