package com.nicealert.ca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSuccess.setOnClickListener{
            Utils.showAlertSuccess(this,
                resources,
                "title success",
                "just a success test message") }

        btError.setOnClickListener{
            Utils.showAlertError(this,
                resources,
                "title error",
                "just a error test message") }

        btWarning.setOnClickListener{
            Utils.showAlertWarning(this,
                resources,
                "title warning",
                "just a warning test message") }
    }
}
