package com.example.gmpindustriais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Adapter.AdapterMoinhos
import com.model.Moinhos

class MoinhosActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_moinhos2)

        val recyclerView_moinhos = findViewById<RecyclerView>(R.id.recyclerView_moinhos)
        recyclerView_moinhos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_moinhos.setHasFixedSize(true)
        //configuração do adapter
        val listaMoinhos: MutableList<Moinhos> = mutableListOf()
        val adapterMoinhos = AdapterMoinhos(this,listaMoinhos)

        recyclerView_moinhos.adapter = adapterMoinhos

        val moinho4= Moinhos(
            R.drawable.moinho2,
            "MBCY",
            "")
        listaMoinhos.add(moinho4)


        val moinho3=Moinhos(
            R.drawable.moinho3,
            "MHAY",
            "")
        listaMoinhos.add(moinho3)


        val moinho2= Moinhos(
            R.drawable.moinho4,
            "MHAY",
            "")
        listaMoinhos.add(moinho2)

        val moinho1= Moinhos(
            R.drawable.moinho5,
            "MHY",
            " "

        )
        listaMoinhos.add(moinho1)

        val moinho6= Moinhos(
            R.drawable.moinho6,
            "MHY",
            " "

        )
        listaMoinhos.add(moinho6)

        val moinho7= Moinhos(
            R.drawable.moinho7,
            "MHY",
            " "

        )
        listaMoinhos.add(moinho7)


    }
}