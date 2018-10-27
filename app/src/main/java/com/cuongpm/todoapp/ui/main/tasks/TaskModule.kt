package com.cuongpm.todoapp.ui.main.tasks

import com.cuongpm.todoapp.di.scope.FragmentScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cuongpm on 9/25/18.
 */

@Module
abstract class TaskModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun bindTaskFragment(): TaskFragment

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun bindMenuFragment(): MenuFragment

}