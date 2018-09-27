package com.cuongpm.todoapp.ui.main.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cuongpm.todoapp.databinding.FragmentTaskBinding
import com.cuongpm.todoapp.di.scope.ActivityScoped
import com.cuongpm.todoapp.ui.main.base.BaseFragment
import javax.inject.Inject

/**
 * Created by cuongpm on 9/24/18.
 */

@ActivityScoped
class TaskFragment @Inject constructor() : BaseFragment() {

    @Inject
    lateinit var taskViewModel: TaskViewModel

    private lateinit var dataBinding: FragmentTaskBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

        dataBinding = FragmentTaskBinding.inflate(inflater, container, false)
    }

    override fun onResume() {
        super.onResume()
        taskViewModel.start()
    }

}