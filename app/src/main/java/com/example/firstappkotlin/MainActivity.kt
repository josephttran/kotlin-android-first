package com.example.firstappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_LONG)
        myToast.show()
    }

    fun countMe(view: View) {
        //Get value in text view
        val countString = textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        //Display new value in the text view
        textView.text = count.toString()
    }
}
