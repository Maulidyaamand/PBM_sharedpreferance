package com.example.sharedpreference

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.sharedpreference.helper.Constant
import com.example.sharedpreference.helper.PreferencesHelper
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    lateinit var sharedPref: PreferencesHelper

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPref = PreferencesHelper(this)

        var npm =findViewById<EditText>(R.id.editNpm)
        val button = findViewById<Button>(R.id.btn_submit)
        var pass = findViewById<EditText>(R.id.editPassword)

        button.setOnClickListener{



    }


    }
}