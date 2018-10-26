package com.cuongpm.todoapp.data.repository

import com.cuongpm.todoapp.data.local.TaskEntity
import com.cuongpm.todoapp.di.qualifier.LocalData
import com.cuongpm.todoapp.di.qualifier.RemoteData
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by cuongpm on 9/23/18.
 */

@Singleton
class TasksRepository @Inject constructor(
        @LocalData tasksLocalDataSource: TasksDataSource,
        @RemoteData tasksRemoteDataSource: TasksDataSource
) : TasksDataSource {

    override fun saveTask(task: TaskEntity) {
    }

}