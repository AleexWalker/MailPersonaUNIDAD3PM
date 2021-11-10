package com.example.mailpersonaunidad3pm

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preferenciasApp = getSharedPreferences("datos", Context.MODE_PRIVATE)
        editTextTextPersonName.setText(preferenciasApp.getString("mail", ""))

        button.setOnClickListener {
            val editor = preferenciasApp.edit()
            editor.putString("mail", editTextTextPersonName.text.toString())
            editor.apply()
            finish()
        }
    }
}