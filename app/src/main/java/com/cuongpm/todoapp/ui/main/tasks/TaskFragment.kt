package com.cuongpm.todoapp.ui.main.tasks

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
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
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var dataBinding: FragmentTaskBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dataBinding = FragmentTaskBinding.inflate(inflater, container, false).apply {
            viewModel = ViewModelProviders.of(this@TaskFragment, viewModelFactory).get(TaskViewModel::class.java)

        }

        return dataBinding.root
    }

    override fun onResume() {
        super.onResume()
        dataBinding.viewModel?.start()

        dataBinding.viewModel?.updateLable("what the heck")
    }

}