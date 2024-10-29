package com.example.cafespot

import android.content.Intent
import android.graphics.Paint
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailCafe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_cafe)

        val myView = findViewById<View>(R.id.main) // Find the view
        myView?.setOnApplyWindowInsetsListener { view, insets ->
            insets
        }

        val back: ImageButton = findViewById(R.id.backButton)
        back.setOnClickListener {
            // Intent untuk berpindah ke Activity2
            val intent = Intent(this@DetailCafe, ListCafe::class.java)
            startActivity(intent)
        }

        // Menambahkan fitur membuka Instagram dengan garis bawah pada teks
        val instagramLink = findViewById<TextView>(R.id.instagramLink)
        instagramLink.paintFlags = instagramLink.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        instagramLink.setOnClickListener {
            val url = "https://www.instagram.com/sasadakopi/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}
