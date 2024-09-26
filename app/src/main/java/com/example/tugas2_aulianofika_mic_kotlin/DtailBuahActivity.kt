package com.example.tugas2_aulianofika_mic_kotlin

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DtailBuahActivity : AppCompatActivity() {

    private lateinit var txtdetailnamabuah : TextView
    private lateinit var imgdetailbuah : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dtail_buah)

        txtdetailnamabuah = findViewById(R.id.txtdetailnamamovie)
        imgdetailbuah = findViewById(R.id.imgdetailbuah)

        //get data
        val detailText = intent.getStringExtra("judul")
        val detaiImg= intent.getIntExtra("image",0)

        txtdetailnamabuah.setText(detailText)
        imgdetailbuah.setImageResource(detaiImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}