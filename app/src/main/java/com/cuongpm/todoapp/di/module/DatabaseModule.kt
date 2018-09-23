package com.cuongpm.todoapp.di.module

import android.arch.persistence.room.Room
import com.cuongpm.todoapp.AppApplication
import com.cuongpm.todoapp.data.local.AppDatabase
import com.cuongpm.todoapp.data.local.TaskDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by cuongpm on 9/23/18.
 */

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(application: AppApplication): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "todo.db").build()
    }

    @Singleton
    @Provides
    fun provideTaskDao(database: AppDatabase): TaskDao = database.taskDao()
}