package com.drdlee.daggermultibinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firstTextView: TextView
    lateinit var secondTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstTextView = findViewById(R.id.string_set)
        secondTextView = findViewById(R.id.string_map)

        val myComponent: MyComponent = DaggerMyComponent.create()

        /**
         * SET
         */
        val set: Set<String> = myComponent.stringSetValues()
        firstTextView.text = " $set"

        /**
         * MAP
         */
        val firstString: String = myComponent.stringMapValues()["myfirst"] ?: "no string found"
        val secondString: String = myComponent.stringMapValues()["mysecond"] ?: "no string found"
        secondTextView.text = "$firstString, $secondString"

    }

}
