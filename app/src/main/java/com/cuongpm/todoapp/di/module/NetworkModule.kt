package com.cuongpm.todoapp.di.module

import android.app.Application
import com.cuongpm.todoapp.data.remote.TaskService
import com.cuongpm.todoapp.util.Memory
import com.facebook.stetho.okhttp3.StethoInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by cuongpm on 9/23/18.
 */

@Module
class NetworkModule {

    fun buildOkHttpClient(application: Application): OkHttpClient =
            OkHttpClient.Builder()
                    .addNetworkInterceptor(StethoInterceptor())
                    .connectTimeout(10L, TimeUnit.SECONDS)
                    .writeTimeout(10L, TimeUnit.SECONDS)
                    .readTimeout(30L, TimeUnit.SECONDS)
                    .cache(Cache(File(application.cacheDir, "TodoCache"),
                            Memory.calcCacheSize(application, .25f)))
                    .build()

    @Provides
    @Singleton
    fun provideOkHttpClient(application: Application): OkHttpClient = buildOkHttpClient(application)

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
            .baseUrl("https://todo.net/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideBrightgateService(retrofit: Retrofit): TaskService = retrofit.create(TaskService::class.java)

}
