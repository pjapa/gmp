package com.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmpindustriais.R
import com.model.Masseiras

class AdapterMasseiras(private val context: Context, private val masseiras:MutableList<Masseiras>): RecyclerView.Adapter<AdapterMasseiras. MasseirasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MasseirasViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.masseiras_item, parent, false)
        val holder =  MasseirasViewHolder(itemLista)
        return holder
    }
    override fun getItemCount(): Int =  masseiras.size


    override fun onBindViewHolder(holder:MasseirasViewHolder, position: Int) {
        holder.foto.setImageResource( masseiras[position].foto)
        holder.descricao.text =  masseiras[position].descricao
        holder.aplicacao.text =  masseiras[position].aplicacao
    }
    inner class MasseirasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_masseira)
        val descricao = itemView.findViewById<TextView>(R.id.nome_descrição)
        val aplicacao = itemView.findViewById<TextView>(R.id.aplicações)
    }
}