package com.example.tugas2_aulianofika_mic_kotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {

    private lateinit var lv_data : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        lv_data = findViewById(R.id.lv_data)

        // bikin array list

        val namahewan =  listOf(
            "gajah",
            "Ular",
            "kucing",
            "kerbau ",
            "panda",
            "ikan",
            "sapi",
            "beruang kutub",
            "cacing alaska",
            "kepiting",
            "kuda"

        )
        //memasukan data array ini kdalm adpter
        //android
        lv_data.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, namahewan)

        //untuk mengklik nma hewan
        lv_data.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"anda memilih : ${namahewan[position]}",
                Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}