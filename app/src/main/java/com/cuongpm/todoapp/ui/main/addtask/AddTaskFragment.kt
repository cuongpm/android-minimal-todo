package com.cuongpm.todoapp.ui.main.addtask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cuongpm.todoapp.databinding.FragmentAddTaskBinding
import com.cuongpm.todoapp.di.scope.ActivityScoped
import com.cuongpm.todoapp.ui.main.base.BaseFragment
import javax.inject.Inject

/**
 * Created by cuongpm on 9/24/18.
 */

@ActivityScoped
class AddTaskFragment @Inject constructor() : BaseFragment() {

    private lateinit var dataBinding: FragmentAddTaskBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dataBinding = FragmentAddTaskBinding.inflate(inflater, container, false).apply {
            viewModel = (activity as AddTaskActivity).viewModel
        }

        return dataBinding.root
    }

}