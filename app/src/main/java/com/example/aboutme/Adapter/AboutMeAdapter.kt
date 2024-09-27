package com.example.aboutme.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aboutme.R
import com.example.aboutme.model.AboutMe

class AboutMeAdapter(private val data: List<AboutMe>):
    RecyclerView.Adapter<AboutMeAdapter.AboutMeViewHolder() {

    class AboutMeViewHolder(private val row: View): RecyclerView.ViewHolder(row){
        val image: ImageView = row.findViewById<ImageView>(R.id.image)
        val aboutMeName: TextView = row.findViewById<TextView>(R.id.about_me_name)
        val aboutMeDescription: TextView = row.findViewById<TextView>(R.id.about_me_description)
        val aboutMeShowMore: Button = row.findViewById<Button>(R.id.about_me_Showmore)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AboutMeAdapter.AboutMeViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.about_mefl, parent, false)
        return AboutMeViewHolder(layout)
    }

    override fun onBindViewHolder(holder: AboutMeAdapter.AboutMeViewHolder, position: Int) {
        holder.image.setImageResource(data[position].imageResId)
        holder.aboutMeName.text = data[position].name
        holder.aboutMeDescription.text = data[position].desc
        holder.aboutMeShowMore.setOnClickListener(data[position].onClickListener)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}


