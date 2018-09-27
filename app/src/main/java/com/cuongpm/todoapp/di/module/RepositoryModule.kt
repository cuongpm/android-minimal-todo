package com.cuongpm.todoapp.di.module

import com.cuongpm.todoapp.di.qualifier.LocalData
import com.cuongpm.todoapp.di.qualifier.RemoteData
import com.cuongpm.todoapp.data.local.TasksLocalDataSource
import com.cuongpm.todoapp.data.remote.TasksRemoteDataSource
import com.cuongpm.todoapp.data.repository.TasksDataSource
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by cuongpm on 9/24/18.
 */

@Module
abstract class RepositoryModule {

    @Singleton
    @Binds
    @LocalData
    abstract fun bindTasksLocalDataSource(localDataSource: TasksLocalDataSource): TasksDataSource

    @Singleton
    @Binds
    @RemoteData
    abstract fun bindTasksRemoteDataSource(remoteDataSource: TasksRemoteDataSource): TasksDataSource
}