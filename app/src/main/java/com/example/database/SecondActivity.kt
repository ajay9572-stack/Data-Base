package com.example.database


import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.database.databinding.ActivityMainBinding
import com.example.database.databinding.ActivitySecondBinding
import com.google.android.material.progressindicator.BaseProgressIndicator


class SecondActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
           binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        val receivedData = intent.getStringExtra("key")
        if (receivedData != null) {
           binding.textView.text = receivedData
        }
        }
    }

