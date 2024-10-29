package com.example.cafespot

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView  // Tambahkan import untuk ImageView

class ListCafe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_cafe)

        // Temukan ImageView dengan ID btn_double_arrow
        val btnDoubleArrow = findViewById<ImageView>(R.id.btn_double_arrow)

        // Menambahkan OnClickListener pada btn_double_arrow
        btnDoubleArrow.setOnClickListener {
            // Buat intent untuk pindah ke halaman DetailCafe
            val intent = Intent(this, DetailCafe::class.java)
            startActivity(intent)
        }
    }
}
