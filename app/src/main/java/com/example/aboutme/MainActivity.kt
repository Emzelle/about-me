package com.example.aboutme

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aboutme.Adapter.AboutMeAdapter
import com.example.aboutme.model.AboutMe
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rvAboutMe: RecyclerView = findViewById(R.id.main)
        rvAboutMe.layoutManager = LinearLayoutManager(this)

        val aboutme1 = AboutMe(
            R.drawable.aboutme,
            name = "Emzelle Xylle D. Awal",
            desc = "I am a very carefree person.",
            {/* TODO */ })

        val aboutme2 = AboutMe(
            R.drawable.aboutme,
            name = "Emzelle Xylle D. Awal",
            desc = "I am a very carefree person.",
            {/* TODO */ })

        val arrList = listOf(aboutme1, aboutme2)

        rvAboutMe.adapter = AboutMeAdapter(arrList)


    }
}