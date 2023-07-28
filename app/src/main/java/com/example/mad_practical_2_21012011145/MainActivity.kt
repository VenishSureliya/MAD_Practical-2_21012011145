package com.example.mad_practical_2_21012011145

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    var someVariable = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called!!")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method is called!!")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method is called!!")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called!!")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is called!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is called!!")
    }

    fun showMessage(message: String){
        Log.i(someVariable, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        val anotherRandomVariable : ConstraintLayout? = findViewById(R.id.someRandomID)



        if (anotherRandomVariable != null){
            Snackbar.make(anotherRandomVariable,
            message,
            Snackbar.LENGTH_SHORT).show()
        }
    }
}