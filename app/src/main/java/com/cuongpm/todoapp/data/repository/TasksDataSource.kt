package com.cuongpm.todoapp.data.repository

import com.cuongpm.todoapp.data.local.TaskEntity

/**
 * Created by cuongpm on 9/23/18.
 */

interface TasksDataSource {

    fun saveTask(task: TaskEntity)

}