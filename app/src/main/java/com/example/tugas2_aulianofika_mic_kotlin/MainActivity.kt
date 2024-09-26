package com.example.tugas2_aulianofika_mic_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtusername: EditText
    lateinit var txtpassword: EditText
    lateinit var btnlogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtusername = findViewById(R.id.txtname)
        txtpassword = findViewById(R.id.txtpass)
        btnlogin = findViewById(R.id.btnlogin)

        btnlogin.setOnClickListener {
            val username = txtusername.text.toString()
            val password = txtpassword.text.toString()

            if(username == "admin"&& password =="123456"){
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "username atau password tidak sesuai", Toast.LENGTH_SHORT).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}