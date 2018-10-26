package com.cuongpm.todoapp.data.local

import com.cuongpm.todoapp.data.repository.TasksDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by cuongpm on 9/23/18.
 */

@Singleton
class TasksLocalDataSource @Inject constructor() : TasksDataSource {

    override fun saveTask(task: TaskEntity) {
    }

}