package com.example.k19_2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyHolder (itemView: View) : ViewHolder(itemView) {
    val ivItem = itemView.findViewById<ImageView>(R.id.iv_item)
    val tvItem = itemView.findViewById<TextView>(R.id.tv_item)
    val tvNhietdo = itemView.findViewById<TextView>(R.id.tv_nhietdo)
    val tvDoam = itemView.findViewById<TextView>(R.id.tv_doam)
}
package com.example.k19_2

import android.graphics.drawable.Icon

data class Infor(
    val name: String,
    val nhietdo: Int,
    val doam: Int,
)

val data = mutableListOf<Infor>(
    Infor("1/1/2024",20,50),
    Infor("2/1/2024",35,50),
    Infor("3/1/2024",24,85)
)