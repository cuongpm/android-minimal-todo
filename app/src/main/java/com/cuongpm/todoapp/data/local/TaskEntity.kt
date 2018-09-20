package com.cuongpm.todoapp.data.local

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "task")
data class TaskEntity constructor(
        @PrimaryKey
        @ColumnInfo(name = "id")
        var id: String = UUID.randomUUID().toString(),

        @ColumnInfo(name = "title")
        var title: String = "",

        @ColumnInfo(name = "description")
        var description: String = ""
) {

        @ColumnInfo(name = "completed")
        var isCompleted = false

}