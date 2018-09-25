package com.cuongpm.todoapp.ui.main.tasks

import com.cuongpm.todoapp.di.scope.ActivityScoped
import com.cuongpm.todoapp.di.scope.FragmentScoped
import dagger.Binds
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

    @ActivityScoped
    @Binds
    abstract fun bindTaskViewModel(viewModel: TaskViewModel): TaskViewModel

}