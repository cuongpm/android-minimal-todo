package com.cuongpm.todoapp.ui.main.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cuongpm.todoapp.data.local.TaskEntity
import com.cuongpm.todoapp.databinding.FragmentTaskBinding
import com.cuongpm.todoapp.di.scope.ActivityScoped
import com.cuongpm.todoapp.ui.component.adapter.TaskAdapter
import com.cuongpm.todoapp.ui.main.base.BaseFragment
import javax.inject.Inject

/**
 * Created by cuongpm on 9/24/18.
 */

@ActivityScoped
class TaskFragment @Inject constructor() : BaseFragment() {

    private lateinit var dataBinding: FragmentTaskBinding

    private lateinit var taskAdapter: TaskAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dataBinding = FragmentTaskBinding.inflate(inflater, container, false).apply {
            viewModel = (activity as TaskActivity).taskViewModel
        }

        return dataBinding.root
    }

    override fun onResume() {
        super.onResume()
        dataBinding.viewModel?.start()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val task1: TaskEntity = TaskEntity(title = "task1")
        val task2: TaskEntity = TaskEntity(title = "task2")
        val task3: TaskEntity = TaskEntity(title = "task3")
        val list: MutableList<TaskEntity> = ArrayList()
        list.add(task1)
        list.add(task2)
        list.add(task3)
        dataBinding.viewModel?.isEmpty?.set(false)

        taskAdapter = TaskAdapter(list, dataBinding.viewModel!!)
        dataBinding.rvTasks.adapter = taskAdapter
    }

}