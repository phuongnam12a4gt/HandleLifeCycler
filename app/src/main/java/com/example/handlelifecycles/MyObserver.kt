package com.example.handlelifecycles

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver(private val life:Lifecycle):LifecycleObserver
{
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun listenerOnCreate()
    {
        Log.i("TAG","OnCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun listenerOnStart()
    {
        Log.i("TAG","OnStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun ListenerResume() {
        Log.i("TAG","OnResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun ListenerOnPause() {
        Log.i("TAG","OnPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun ListenerOnStop()
    {
        Log.i("TAG","OnStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun ListenerDestroy()
    {
        Log.i("TAG","OnDestroy")
    }

    fun onCheck()
    {
        if (life.currentState.isAtLeast(Lifecycle.State.STARTED))
        {
            Log.i("TAG","State Started")
        }
    }
}
