package com.example.tugas2_aulianofika_mic_kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2_aulianofika_mic_kotlin.adapter.BukuAdapter
import com.example.tugas2_aulianofika_mic_kotlin.model.ModelBuku

private lateinit var rev_data: RecyclerView

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rev_data = findViewById(R.id.rv_data)

        //array buku list
        val listBuku = listOf(
            ModelBuku(judul = "android 1 ", penulis = "aulia nofika"),
            ModelBuku(judul = "android 2 ", penulis = "aulia nofika"),
            ModelBuku(judul = "android 3 ", penulis = "aulia nofika"),
            ModelBuku(judul = "android 4 ", penulis = "aulia nofika"),
            ModelBuku(judul = "android 5 ", penulis = "aulia nofika"),
            ModelBuku(judul = "android 6 ", penulis = "aulia nofika"),
            ModelBuku(judul = "android 7 ", penulis = "aulia nofika"),



        )
// kita set adaptter
        val nBukuAdapter = BukuAdapter(listBuku)
        rev_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleViewActivity)
            adapter = nBukuAdapter
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}