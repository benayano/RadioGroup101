package com.example.radiogroup101

import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {


    private val radioGroup: RadioGroup by lazy { findViewById(R.id.rG) }
    private val btnOk: Button by lazy { findViewById(R.id.buttonOk) }
    private val btnCancel: Button by lazy { findViewById(R.id.buttonCancel) }
    private val tvTitle: TextView by lazy { findViewById(R.id.tvTitle) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnOk.setOnClickListener {

            val selectionId = radioGroup.checkedRadioButtonId
            if (selectionId != -1) {
                val selectionButton: Button = findViewById(selectionId)

                tvTitle.text = selectionButton.text

            }else{
                Snackbar.make(tvTitle,"the result is $selectionId",Snackbar.LENGTH_LONG).show()
            }
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