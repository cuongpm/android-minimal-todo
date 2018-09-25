package com.cuongpm.todoapp.di.module

import com.cuongpm.todoapp.data.Local
import com.cuongpm.todoapp.data.Remote
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
    @Local
    abstract fun bindTasksLocalDataSource(localDataSource: TasksLocalDataSource): TasksDataSource

    @Singleton
    @Binds
    @Remote
    abstract fun bindTasksRemoteDataSource(remoteDataSource: TasksRemoteDataSource): TasksDataSource
}