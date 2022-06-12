package com.example.gmpindustriais

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class DescricaoMasseiras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao_masseiras)
        val btnmasseiras = findViewById<AppCompatButton>(R.id.btnmasseiras)
        btnmasseiras.setOnClickListener {
            val intent = Intent(this, MasseirasActivity2::class.java)
            startActivity(intent)
        }
    }



}
