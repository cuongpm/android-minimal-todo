package com.cuongpm.todoapp.ui.main.tasks

import android.os.Bundle
import com.cuongpm.todoapp.R
import com.cuongpm.todoapp.ui.main.base.BaseActivity
import com.cuongpm.todoapp.util.ext.addFragment

/**
 * Created by cuongpm on 9/23/18.
 */

class TaskActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        addFragment(R.id.content_frame, ::TaskFragment)
    }

}