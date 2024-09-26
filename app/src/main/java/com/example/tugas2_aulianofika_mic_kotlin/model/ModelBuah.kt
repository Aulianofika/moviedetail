package com.example.tugas2_aulianofika_mic_kotlin.model

import com.example.tugas2_aulianofika_mic_kotlin.R

data class ModelBuah(
    val image: Int,
    val judul : String
)
object MockList{
    fun getModel(): List<ModelBuah>{
        val item1 = ModelBuah(
            R.drawable.orange, judul = "orange"
        )
        val item2 = ModelBuah(
            R.drawable.pear, judul = "pear"
        )
        val item3 = ModelBuah(
            R.drawable.strawberry, judul = "strawberry"
        )
        val item4 = ModelBuah(
            R.drawable.grapes, judul = "grapes"
        )
        val item5 = ModelBuah(
            R.drawable.apple, judul = "apple"
        )
        val item6 = ModelBuah(
            R.drawable.orange, judul = "orange"
        )
        val itemList:ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return itemList

    }
}

