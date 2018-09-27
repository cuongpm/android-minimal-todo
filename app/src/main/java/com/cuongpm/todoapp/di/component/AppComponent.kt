package com.cuongpm.todoapp.di.component

import com.cuongpm.todoapp.AppApplication
import com.cuongpm.todoapp.di.module.ActivityBindingModule
import com.cuongpm.todoapp.di.module.AppModule
import com.cuongpm.todoapp.di.module.DatabaseModule
import com.cuongpm.todoapp.di.module.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by cuongpm on 9/23/18.
 */

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class,
    DatabaseModule::class, RepositoryModule::class, ActivityBindingModule::class])
interface AppComponent : AndroidInjector<AppApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(appApplication: AppApplication): Builder

        fun build(): AppComponent
    }
}