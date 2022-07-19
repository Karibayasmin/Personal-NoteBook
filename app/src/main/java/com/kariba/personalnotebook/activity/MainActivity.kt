package com.kariba.personalnotebook.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kariba.personalnotebook.R
import com.kariba.personalnotebook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.lifecycleOwner = this

        initView(binding)
    }

    private fun initView(binding: ActivityMainBinding) {
        binding.layoutCreateNote.setOnClickListener {
            val intent = Intent(this@MainActivity, NewNotePage::class.java)
            startActivity(intent)
        }
    }
}