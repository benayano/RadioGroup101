package com.example.radiogroup101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private val radioGroup:RadioGroup by lazy { findViewById(R.id.rG) }
    private val btnOk:Button by lazy { findViewById(R.id.buttonOk) }
    private val btnCancel:Button by lazy { findViewById(R.id.buttonCancel) }
    private val tvTitle:TextView by lazy { findViewById(R.id.tvTitle) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnOk.setOnClickListener {

            val selectionId = radioGroup.checkedRadioButtonId
            val selectionButton:Button =findViewById(selectionId)
            tvTitle.text = selectionButton.text
        }
        btnCancel.setOnClickListener {
            radioGroup.clearCheck()
            tvTitle.text = "hello world!!!"
        }
        tvTitle.setOnClickListener {
            radioGroup.clearCheck()
        }


    }
}