package com.codingwithmitch.espressodaggerexamples

import com.codingwithmitch.espressodaggerexamples.di.DaggerTestAppComponent
import com.codingwithmitch.espressodaggerexamples.di.TestAppComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi

@ExperimentalCoroutinesApi
@UseExperimental(InternalCoroutinesApi::class)
class TestBaseApplication : BaseApplication(){

    override fun onCreate() {
        super.onCreate()
        initAppComponent()
    }

    override fun initAppComponent() {
        appComponent = DaggerTestAppComponent.builder()
            .application(this)
            .build()
    }
}










