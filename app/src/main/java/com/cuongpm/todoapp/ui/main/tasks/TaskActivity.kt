package com.cuongpm.todoapp.ui.main.tasks

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import com.cuongpm.todoapp.R
import com.cuongpm.todoapp.ui.main.addtask.AddTaskActivity
import com.cuongpm.todoapp.ui.main.base.BaseActivity
import com.cuongpm.todoapp.util.ext.addFragment
import javax.inject.Inject

/**
 * Created by cuongpm on 9/23/18.
 */

class TaskActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(TaskViewModel::class.java).apply {
            addTaskEvent.observe(this@TaskActivity, Observer {
                startActivity(Intent(this@TaskActivity, AddTaskActivity::class.java))
            })
        }

        addFragment(R.id.content_frame, ::TaskFragment)
    }

}