package com.example.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.birthdaywishingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val PERSON_NAME ="PERSON_NAME"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnCreateCard.setOnClickListener {
            val intent = Intent(this,GreetingsActivity::class.java)
            intent.putExtra(PERSON_NAME,binding.etPersonName.text.toString())
            startActivity(intent)
        }
    }
}