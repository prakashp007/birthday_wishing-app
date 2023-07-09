package com.example.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.birthdaywishingapp.databinding.ActivityGreetingsBinding

class GreetingsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityGreetingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_greetings)
        binding.tvPersonName.text  = intent.getStringExtra(MainActivity.PERSON_NAME)
    }
}