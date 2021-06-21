package com.example.radiogroup101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {


    private val radioGroup:RadioGroup by lazy { findViewById(R.id.rG) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}