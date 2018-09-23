package com.cuongpm.todoapp.data.local

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by cuongpm on 9/23/18.
 */

@Database(entities = [TaskEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao
}