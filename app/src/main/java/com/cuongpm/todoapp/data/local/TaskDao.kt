package com.cuongpm.todoapp.data.local

/**
 * Created by cuongpm on 9/23/18.
 */

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface TaskDao {

    /**
     * Select all tasks from Task table
     *
     * @return all tasks
     */
    @Query("SELECT * FROM Task")
    fun getAllTasks(): List<TaskEntity>

    /**
     * Insert a task in the database. If the task already exists, replace it
     *
     * @param task the task to be inserted
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: TaskEntity)

}
