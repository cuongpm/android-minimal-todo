package com.cuongpm.todoapp.di.module

import com.cuongpm.todoapp.di.scope.ActivityScoped
import com.cuongpm.todoapp.ui.main.addtask.AddTaskActivity
import com.cuongpm.todoapp.ui.main.addtask.AddTaskModule
import com.cuongpm.todoapp.ui.main.taskdetail.TaskDetailActivity
import com.cuongpm.todoapp.ui.main.taskdetail.TaskDetailModule
import com.cuongpm.todoapp.ui.main.tasks.TaskActivity
import com.cuongpm.todoapp.ui.main.tasks.TaskModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cuongpm on 9/23/18.
 */

@Module
internal abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [AddTaskModule::class])
    internal abstract fun bindAddTaskActivity(): AddTaskActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = [TaskModule::class])
    internal abstract fun bindTaskActivity(): TaskActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = [TaskDetailModule::class])
    internal abstract fun bindTaskDetailActivity(): TaskDetailActivity

}