package com.example.handlelifecycles

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

class MyActivity : LifecycleOwner {
    private lateinit var lifecyclerRegistry: LifecycleRegistry

    constructor() {
        lifecyclerRegistry = LifecycleRegistry(this)
        lifecyclerRegistry.addObserver(MyObserver(lifecyclerRegistry))
    }

    fun startOwner() {
        lifecyclerRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START)
        lifecyclerRegistry.currentState = Lifecycle.State.STARTED
        MyObserver(lifecycle).onCheck()
    }

    fun stopOwner() {
        lifecyclerRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP)
    }

    override fun getLifecycle(): Lifecycle {
        return lifecyclerRegistry
    }

}
