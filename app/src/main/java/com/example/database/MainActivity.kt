package com.example.database

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.database.R
import com.example.database.SecondActivity
import com.example.database.User
import com.example.database.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        with(binding){
            binding.resBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("key", "value")
                startActivity(intent)
            }
        }
        val resbtn = binding.resBtn
        val name = binding.name
        val eml = binding.eml
        val pass = binding.pass
        val main = binding.main

        resbtn.setOnClickListener {
            val name = name.text.toString()
            val eml = eml.text.toString()
            val pass = pass.text.toString()


            val User = User(name, eml,pass )
            database = FirebaseDatabase.getInstance().getReference("user")

        }
    }
}