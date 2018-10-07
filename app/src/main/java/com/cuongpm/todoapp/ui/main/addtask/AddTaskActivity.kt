package com.cuongpm.todoapp.ui.main.addtask

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.cuongpm.todoapp.R
import com.cuongpm.todoapp.ui.main.base.BaseActivity
import com.cuongpm.todoapp.util.ext.addFragment
import javax.inject.Inject

/**
 * Created by cuongpm on 9/23/18.
 */

class AddTaskActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: AddTaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(AddTaskViewModel::class.java).apply {
        }

        addFragment(R.id.content_frame, ::AddTaskFragment)
    }

}
