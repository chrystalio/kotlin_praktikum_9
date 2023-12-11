package com.example.praktikum_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        val nama = intent.getStringExtra("EXTRA_NAMA")
        val usia = intent.getIntExtra("EXTRA_USIA", 0)
        val alamat = intent.getStringExtra("EXTRA_ALAMAT")

        val hasilData = "Nama anda adalah : $nama \n " +
                "Usia anda adalah : $usia \n " +
                "Alamat anda adalah : $alamat"

        tvHasil.text = hasilData

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }
    }
}