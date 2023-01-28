package com.pratyaksh_khurana.demoapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Extract buttons by their IDs
        val button1 = findViewById<Button>(R.id.button_1)
        val button2 = findViewById<Button>(R.id.button_2)
        val button3 = findViewById<Button>(R.id.button_3)
        val button4 = findViewById<Button>(R.id.button_4)

        button1.setOnClickListener {
            buttonClicked(1)
        }

        button2.setOnClickListener {
            buttonClicked(2)
        }

        button3.setOnClickListener {
            buttonClicked(3)
        }

        button4.setOnClickListener {
            buttonClicked(4)
        }
    }

    // Display toast message corresponding to buttonNumber
    private fun buttonClicked(buttonNumber: Int) {
        when (buttonNumber) {
            1 -> {
                Toast.makeText(this, "Button $buttonNumber clicked !", Toast.LENGTH_SHORT).show()
            }
            2 -> {
                Toast.makeText(this, "Button $buttonNumber clicked !", Toast.LENGTH_SHORT).show()
            }
            3 -> {
                Toast.makeText(this, "Button $buttonNumber clicked !", Toast.LENGTH_SHORT).show()
            }
            4 -> {
                Toast.makeText(this, "Button $buttonNumber clicked !", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
