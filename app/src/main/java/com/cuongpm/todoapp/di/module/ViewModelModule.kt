package com.cuongpm.todoapp.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.cuongpm.todoapp.di.ViewModelKey
import com.cuongpm.todoapp.ui.main.addtask.AddTaskViewModel
import com.cuongpm.todoapp.ui.main.taskdetail.TaskDetailViewModel
import com.cuongpm.todoapp.ui.main.tasks.MenuViewModel
import com.cuongpm.todoapp.ui.main.tasks.TaskViewModel
import com.cuongpm.todoapp.util.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

/**
 * Created by cuongpm on 9/25/18.
 */

@Module(includes = [AppModule::class, RepositoryModule::class])
abstract class ViewModelModule {

    @Singleton
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(TaskViewModel::class)
    abstract fun bindTaskViewModel(viewModel: TaskViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TaskDetailViewModel::class)
    abstract fun bindTaskDetailViewModel(viewModel: TaskDetailViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AddTaskViewModel::class)
    abstract fun bindAddTaskViewModel(viewModel: AddTaskViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MenuViewModel::class)
    abstract fun bindMenuViewModel(viewModel: MenuViewModel): ViewModel
}