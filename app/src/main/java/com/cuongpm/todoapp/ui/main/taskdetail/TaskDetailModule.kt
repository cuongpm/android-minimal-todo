package com.cuongpm.todoapp.ui.main.taskdetail

import com.cuongpm.todoapp.di.scope.FragmentScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cuongpm on 9/25/18.
 */

@Module
abstract class TaskDetailModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun bindTaskDetailFragment(): TaskDetailFragment

}