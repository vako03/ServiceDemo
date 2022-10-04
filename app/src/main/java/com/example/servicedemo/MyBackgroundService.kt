package com.example.servicedemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyBackgroundService : Service() {

    init {
        Log.i(TAG,"Services has been created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG, "Service Started" )

        return START_STICKY
    }

    override fun onBind(p0: Intent?): IBinder? = null

    override fun onDestroy() {
        Log.i(TAG, "Destroying ... ")
        super.onDestroy()
    }

    companion object {
        const val TAG = "MYTAG"
    }
}