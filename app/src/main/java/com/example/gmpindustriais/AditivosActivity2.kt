package com.example.gmpindustriais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Adapter.AdapterAditivos
import com.model.Aditivos

class AditivosActivity2 : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_aditivos2)

        val recyclerView_aditivos = findViewById<RecyclerView>(R.id.recyclerView_aditivos)
        recyclerView_aditivos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_aditivos.setHasFixedSize(true)
        //configuração do adapter
        val listaAditivos: MutableList<Aditivos> = mutableListOf()
        val adapterAditivos = AdapterAditivos(this,listaAditivos)

        recyclerView_aditivos.adapter = adapterAditivos

        val aditivos4= Aditivos(
            R.drawable.aditivos2,
            "MBCY",
            "")
        listaAditivos.add(aditivos4)


        val aditivos3= Aditivos(
            R.drawable.aditivos3,
            "MHAY",
            "")
        listaAditivos.add(aditivos3)


        val aditivos2= Aditivos(
            R.drawable.moinho4,
            "MHAY",
            "")
        listaAditivos.add(aditivos2)

        val aditivos1= Aditivos(
            R.drawable.aditivos5,
            "MHY",
            " "

        )
        listaAditivos.add(aditivos1)

        val aditivos6= Aditivos(
            R.drawable.aditivos6,
            "MHY",
            " "

        )
        listaAditivos.add(aditivos6)

        val aditivos7= Aditivos(
            R.drawable.aditivos1,
            "MHY",
            " "

        )
        listaAditivos.add(aditivos7)


    }
}