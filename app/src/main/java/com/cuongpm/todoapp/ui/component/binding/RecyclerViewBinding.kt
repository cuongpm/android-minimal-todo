package com.cuongpm.todoapp.ui.component.binding

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.cuongpm.todoapp.data.local.TaskEntity
import com.cuongpm.todoapp.ui.component.adapter.TaskAdapter

/**
 * Created by cuongpm on 10/27/18.
 */

object RecyclerViewBinding {

    @BindingAdapter("app:items")
    @JvmStatic
    fun setItems(recyclerView: RecyclerView, items: List<TaskEntity>) {
        with(recyclerView.adapter as TaskAdapter) {
            setData(items)
        }
    }
}