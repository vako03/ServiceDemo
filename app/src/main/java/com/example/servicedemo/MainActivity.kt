package com.example.servicedemo

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.servicedemo.MyBackgroundService.Companion.TAG
import com.example.servicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serviceIntent = Intent(this,MyBackgroundService::class.java)
        binding.btnStart.setOnClickListener {
            Log.i(TAG,"Starting service")
            startService(serviceIntent)


        }
        binding.btnStop.setOnClickListener {
            Log.i(TAG,"Sopping service")

        stopService(serviceIntent)

        }

    }
}
