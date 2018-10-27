package com.cuongpm.todoapp.ui.component.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.cuongpm.todoapp.R
import com.cuongpm.todoapp.data.local.TaskEntity
import com.cuongpm.todoapp.databinding.ItemTaskBinding
import com.cuongpm.todoapp.ui.main.tasks.TaskViewModel

/**
 * Created by cuongpm on 9/23/18.
 */

class TaskAdapter(
        private var tasks: List<TaskEntity>,
        private val taskViewModel: TaskViewModel
) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = DataBindingUtil.inflate<ItemTaskBinding>(LayoutInflater.from(parent.context),
                R.layout.item_task, parent, false)

        return TaskViewHolder(binding)
    }

    override fun getItemCount() = tasks.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) = holder.bind(tasks[position])

    class TaskViewHolder(val binding: ItemTaskBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(taskEntity: TaskEntity) {
            with(binding)
            {
                task = taskEntity
//                listener = selectNetworkListener
                executePendingBindings()
            }
        }
    }

    fun setData(tasks: List<TaskEntity>) {
        this.tasks = tasks
        notifyDataSetChanged()
    }
}
