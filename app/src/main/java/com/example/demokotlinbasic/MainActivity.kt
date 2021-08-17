package com.example.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            //==============KotLinBasic==============
            val userDob = etDOB.text.toString()

            //==========-------IfElse--------============
            if (userDob.isNotEmpty()) {
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDob.toInt()
                tvShowAge.text = "Your age is $age"

                //-------------------InternalIfLoop-------------
                when (age) {
                    in 0..17 -> tvDescription.text = "Underage"
                    in 18..65 -> tvDescription.text = "Young People"
                    in 66..79 -> tvDescription.text = "Middle-aged"
                    in 80..99 -> tvDescription.text = "Elderly"
                    else -> {
                        tvDescription.text = "Long-lived elderly"
                    }

                }
                //-------------------InternalIfLoop-------------
            }
            else {
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_SHORT).show()
            }
            //==========-------IfElse--------============
            //==============KotLinBasic==============


        }
    }
}
