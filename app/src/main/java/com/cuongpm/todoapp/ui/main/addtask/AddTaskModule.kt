package com.cuongpm.todoapp.ui.main.addtask

import com.cuongpm.todoapp.di.scope.FragmentScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cuongpm on 9/25/18.
 */

@Module
abstract class AddTaskModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun bindAddTaskFragment(): AddTaskFragment

}