package com.example.view

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
//            val toast = Toast.makeText(this, "Hooray", Toast.LENGTH_SHORT)
//            toast.show()
            val textView: TextView = findViewById(R.id.textView)
            textView.text = "Mama mia "

        }
    }
}