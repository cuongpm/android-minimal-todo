package com.cuongpm.todoapp.ui.main.addtask

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
abstract class AddTaskModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun bindAddTaskFragment(): AddTaskFragment

    @ActivityScoped
    @Binds
    abstract fun bindAddTaskViewModel(viewModel: AddTaskViewModel): AddTaskViewModel

}