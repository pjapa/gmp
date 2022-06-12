package com.example.gmpindustriais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.Adapter.AdapterMasseiras
import com.model.Masseiras

class MasseirasActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_masseiras2)

        val recyclerView_masseiras = findViewById<RecyclerView>(R.id.recyclerView_masseiras)
        recyclerView_masseiras.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView_masseiras.setHasFixedSize(true)
        //configuração do adapter
        val listaMasseiras: MutableList<Masseiras> = mutableListOf()
        val adapterMasseiras = AdapterMasseiras(this,listaMasseiras)

        recyclerView_masseiras.adapter = adapterMasseiras

        val masseira4=Masseiras(
            R.drawable.masseira4,
            "MBCY",
            "")
        listaMasseiras.add(masseira4)


        val masseira3=Masseiras(
            R.drawable.masseira3,
            "MHAY",
            "")
        listaMasseiras.add(masseira3)


        val masseira2=Masseiras(
            R.drawable.masseira2,
            "MHAY",
            "")
        listaMasseiras.add(masseira2)

        val masseira1=Masseiras(
            R.drawable.masseira1,
            "MHY",
            " "

        )
        listaMasseiras.add(masseira1)


    }
}