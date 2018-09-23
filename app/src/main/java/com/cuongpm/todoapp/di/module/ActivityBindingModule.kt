package com.cuongpm.todoapp.di.module

import com.cuongpm.todoapp.di.scope.ActivityScoped
import com.cuongpm.todoapp.ui.main.addtask.AddTaskActivity
import com.cuongpm.todoapp.ui.main.taskdetail.TaskDetailActivity
import com.cuongpm.todoapp.ui.main.tasks.TaskActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cuongpm on 9/23/18.
 */

@Module
internal abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector
    internal abstract fun addTaskActivity(): AddTaskActivity

    @ActivityScoped
    @ContributesAndroidInjector
    internal abstract fun taskActivity(): TaskActivity

    @ActivityScoped
    @ContributesAndroidInjector
    internal abstract fun taskDetailActivity(): TaskDetailActivity

}