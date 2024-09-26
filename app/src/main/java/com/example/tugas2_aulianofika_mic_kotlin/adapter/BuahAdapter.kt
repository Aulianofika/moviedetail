package com.example.tugas2_aulianofika_mic_kotlin.adapter

import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2_aulianofika_mic_kotlin.DtailBuahActivity
import com.example.tugas2_aulianofika_mic_kotlin.R
import com.example.tugas2_aulianofika_mic_kotlin.RecycleBuahImageActivity
import com.example.tugas2_aulianofika_mic_kotlin.model.ModelBuah

class BuahAdapter(val itemList:ArrayList<ModelBuah>,
    private val getActivity: RecycleBuahImageActivity//untuk bisa call intent
    )
    : RecyclerView.Adapter<BuahAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemNama: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_buah,
            parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].judul)


        // tamvbah intent untuk passing data ke detail
        holder.itemView.setOnClickListener (){
            // deklarasi intent
            val intent = Intent(getActivity, DtailBuahActivity::class.java)
            //putextra
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("judul", itemList[position].judul)

            // intent.putextra("judul", itemlist[posituon]. judul)
                //start pindah ke detail
            getActivity.startActivity(intent)
        }
    }
}