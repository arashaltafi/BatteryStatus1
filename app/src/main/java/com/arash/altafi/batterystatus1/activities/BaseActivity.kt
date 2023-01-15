package com.arash.altafi.batterystatus1.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.batterystatus1.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityBaseBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()
    }

    private fun init() = binding.apply {
        btnCompose.setOnClickListener {
            startActivity(Intent(this@BaseActivity, MainActivityCompose::class.java))
        }
        btnXml.setOnClickListener {
            startActivity(Intent(this@BaseActivity, MainActivity::class.java))
        }
    }

}