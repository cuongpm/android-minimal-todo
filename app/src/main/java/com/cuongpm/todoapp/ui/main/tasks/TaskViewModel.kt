package com.cuongpm.todoapp.ui.main.tasks

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import com.cuongpm.todoapp.data.repository.TasksRepository
import com.cuongpm.todoapp.di.qualifier.ApplicationContext
import com.cuongpm.todoapp.util.SingleLiveEvent
import javax.inject.Inject

/**
 * Created by cuongpm on 9/24/18.
 */

class TaskViewModel @Inject constructor(
        @ApplicationContext context: Context,
        private val tasksRepository: TasksRepository
) : ViewModel() {

    // Create observables to update views automatically
    val isLoading = ObservableBoolean(false)
    val isEmpty = ObservableBoolean(true)
    val myLable = ObservableField<String>()
    val addTaskEvent = SingleLiveEvent<Void>()

    /**
     * Start [TaskViewModel] from [TaskFragment]
     */
    fun start() {
        loadAllTasks()
    }

    /**
     *  Load all to-do tasks
     */
    fun loadAllTasks() {

    }

    /**
     *  Add new task when clicking on FAB button
     */
    fun addNewTask() {
        addTaskEvent.call()
    }

}