package com.cuongpm.todoapp.ui.main.addtask

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.cuongpm.todoapp.data.repository.TasksRepository
import javax.inject.Inject

/**
 * Created by cuongpm on 9/24/18.
 */

class AddTaskViewModel @Inject constructor(
        private val context: Application,
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