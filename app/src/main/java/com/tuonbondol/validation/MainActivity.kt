package com.tuonbondol.validation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.tuonbondol.validationutil.isMatchPassword
import com.tuonbondol.validationutil.isValidEmail
import kotlinx.android.synthetic.main.activity_main.*

/***
 *
 * @author TUON BONDOL
 *
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isMatchPassword("a", "A")

        btnCheckEmail.setOnClickListener {
            if (etEmail.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (isValidEmail(etEmail.text.toString())) {
                Toast.makeText(this, "Email is Valid", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Email is Invalid", Toast.LENGTH_LONG).show()
        }
    }
}