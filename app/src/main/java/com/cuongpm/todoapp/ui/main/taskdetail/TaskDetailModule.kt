package com.cuongpm.todoapp.ui.main.taskdetail

import com.cuongpm.todoapp.di.module.AppModule
import com.cuongpm.todoapp.di.module.RepositoryModule
import com.cuongpm.todoapp.di.scope.ActivityScoped
import com.cuongpm.todoapp.di.scope.FragmentScoped
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by cuongpm on 9/25/18.
 */

@Module(includes = [AppModule::class, RepositoryModule::class])
abstract class TaskDetailModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun bindTaskDetailFragment(): TaskDetailFragment

    @ActivityScoped
    @Binds
    abstract fun bindTaskDetailViewModel(viewModel: TaskDetailViewModel): TaskDetailViewModel

}