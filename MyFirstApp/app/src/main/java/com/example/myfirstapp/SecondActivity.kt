package com.example.myfirstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity (){

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.txtSecond.text = intent.getStringExtra("data")
    }
}