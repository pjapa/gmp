package com.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmpindustriais.R
import com.model.Disperssores

class AdapterDisperssores(private val context: Context, private val disperssores:MutableList<Disperssores>): RecyclerView.Adapter<AdapterDisperssores. DisperssoresViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):DisperssoresViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.disperssores_item, parent, false)
        val holder =  DisperssoresViewHolder(itemLista)
        return holder
    }
    override fun getItemCount(): Int =  disperssores.size


    override fun onBindViewHolder(holder:DisperssoresViewHolder, position: Int) {
        holder.foto.setImageResource( disperssores[position].foto)
        holder.descricao.text =  disperssores[position].descricao
        holder.aplicacao.text =  disperssores[position].aplicacao
    }
    inner class DisperssoresViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_disperssor)
        val descricao = itemView.findViewById<TextView>(R.id.nome_descrição)
        val aplicacao = itemView.findViewById<TextView>(R.id.aplicações)
    }
}