package com.example.gmpindustriais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Adapter.AdapterHelices
import com.model.Helices

class HelicesActivity2 : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_helices2)

        val recyclerView_helices = findViewById<RecyclerView>(R.id.recyclerView_helices)
        recyclerView_helices.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_helices.setHasFixedSize(true)
        //configuração do adapter
        val listaHelices: MutableList<Helices> = mutableListOf()
        val adapterHelices = AdapterHelices(this,listaHelices)

        recyclerView_helices.adapter = adapterHelices

        val helice4= Helices(
            R.drawable.helice1,
            "MBCY",
            "")
        listaHelices.add(helice4)


        val helice3=  Helices(
            R.drawable.helice2,
            "MHAY",
            "")
        listaHelices.add(helice3)


        val helice2= Helices(
            R.drawable.helice3,
            "MHAY",
            "")
        listaHelices.add(helice2)

        val helice1=  Helices(
            R.drawable.helice4,
            "MHY",
            " "

        )
        listaHelices.add(helice1)

        val helice6=  Helices(
            R.drawable.helice5,
            "MHY",
            " "

        )
        listaHelices.add(helice6)

        val helice7=  Helices(
            R.drawable.helice6,
            "MHY",
            " "

        )
        listaHelices.add(helice7)

        val helice8=  Helices(
            R.drawable.helice7,
            "MHY",
            " "

        )
        listaHelices.add(helice8)


    }
}