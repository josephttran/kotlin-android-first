package com.example.firstappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.textview_label
import kotlinx.android.synthetic.main.activity_second.textview_random
import java.util.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        //Generate random number
        val random = Random()
        var randomInt = 0
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }

        //Display random number
        textview_random.text = Integer.toString(randomInt)

        //Update heading max value
        textview_label.text = getString(R.string.random_heading, count)
    }
}
