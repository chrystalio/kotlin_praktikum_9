package com.example.praktikum_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val edNama = findViewById<EditText>(R.id.edNama)
        val edUsia = findViewById<EditText>(R.id.edUsia)
        val edAlamat = findViewById<EditText>(R.id.edAlamat)

        btnSubmit.setOnClickListener {
            val nama = edNama.text.toString()
            val usia = edUsia.text.toString().toInt()
            val alamat = edAlamat.text.toString()

            btnSubmit.setOnClickListener {
                val nama = edNama.text.toString()
                val usia = edUsia.text.toString().toInt()
                val alamat = edAlamat.text.toString()

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("EXTRA_NAMA", nama)
                intent.putExtra("EXTRA_USIA", usia)
                intent.putExtra("EXTRA_ALAMAT", alamat)
                startActivity(intent)
            }
        }

    }
}