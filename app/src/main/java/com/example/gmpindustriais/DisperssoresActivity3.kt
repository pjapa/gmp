package com.example.gmpindustriais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Adapter.AdapterDisperssores
import com.model.Disperssores

class DisperssoresActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_disperssores3)

        val disperssores = findViewById<RecyclerView>(R.id.disperssores)
        disperssores.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        disperssores.setHasFixedSize(true)
        //configuração do adapter
        val listaDisperssores: MutableList<Disperssores> = mutableListOf()
        val adapterDisperssores = AdapterDisperssores(this,listaDisperssores)

        disperssores.adapter = adapterDisperssores

        val disperssor4= Disperssores(
            R.drawable.disperssor4,
            "DFLBY",
            "")
        listaDisperssores.add(disperssor4)


        val disperssor3= Disperssores(
            R.drawable.disperssor3,
            "DHM",
            "")
        listaDisperssores.add(disperssor3)


        val disperssor2= Disperssores(
            R.drawable.disperssor2,
            "DHY",
            "")
        listaDisperssores.add(disperssor2)

        val disperssor1= Disperssores(
            R.drawable.disperssor1,
            "DHY",
            "")
        listaDisperssores.add(disperssor1)
    }
}