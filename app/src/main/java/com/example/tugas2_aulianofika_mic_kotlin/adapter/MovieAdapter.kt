package com.example.tugas2_aulianofika_mic_kotlin.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas2_aulianofika_mic_kotlin.Detailmovie
import com.example.tugas2_aulianofika_mic_kotlin.MovieActivity
import com.example.tugas2_aulianofika_mic_kotlin.R
import com.example.tugas2_aulianofika_mic_kotlin.model.ModelMovie

class MovieAdapter(
    private val getActivity : MovieActivity,//agar recycle bisa diklik
    private val movieList: List<ModelMovie>



    ) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val txtMovie: TextView = itemView.findViewById(R.id.txtmovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgmovie)
        val cardMovie: CardView = itemView.findViewById(R.id.cardMovie)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieAdapter.MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].titlle
        holder.imgMovie.setImageResource(movieList[position].image)

        holder.itemView.setOnClickListener() {
            val intent = Intent(getActivity, Detailmovie::class.java)

            intent.putExtra("image", movieList[position].image)
            intent.putExtra("judul", movieList[position].titlle)
            //deklarasi
            getActivity.startActivity(intent)


            //untuk bisa diklik
            holder.cardMovie.setOnClickListener() {
                Toast.makeText(getActivity, movieList[position].titlle, Toast.LENGTH_SHORT).show()
            }
        }
    }
}