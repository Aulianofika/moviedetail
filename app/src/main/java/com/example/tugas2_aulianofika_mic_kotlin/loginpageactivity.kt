package com.example.tugas2_aulianofika_mic_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loginpageactivity : AppCompatActivity() {

    private lateinit var eUser : EditText
    private lateinit var ePass : EditText
    private lateinit var btnlogin :Button
    private lateinit var btnRecycle :Button
    private lateinit var btnmovie: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginpage)

        eUser = findViewById(R.id.euser)
        ePass = findViewById(R.id.epass)
        btnlogin = findViewById(R.id.btnlogin)
        btnRecycle = findViewById(R.id.btnRecycle)
        btnmovie = findViewById(R.id.btnmovie)

        btnmovie.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        btnRecycle.setOnClickListener {
            val intent = Intent(this, RecycleViewActivity::class.java)
            startActivity(intent)
        }
        btnlogin.setOnClickListener {
            val nUsername = eUser.text.toString()
            val nPassword = ePass.text.toString()

            val intentPassingData = Intent(this@loginpageactivity,
                welcomepageactivity::class.java)
            intentPassingData.putExtra("username", nUsername)
            intentPassingData.putExtra("password", nPassword)

                    startActivity(intentPassingData)

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}