package com.cuongpm.todoapp.ui.main.addtask

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.databinding.ObservableField
import com.cuongpm.todoapp.data.repository.TasksRepository
import com.cuongpm.todoapp.di.qualifier.ApplicationContext
import javax.inject.Inject

/**
 * Created by cuongpm on 9/24/18.
 */

class AddTaskViewModel @Inject constructor(
        @ApplicationContext context: Context,
        private val tasksRepository: TasksRepository
) : ViewModel() {

    val title = ObservableField<String>()
    val description = ObservableField<String>()

    /**
     * Save task
     */
    fun saveTask() {

    }

}