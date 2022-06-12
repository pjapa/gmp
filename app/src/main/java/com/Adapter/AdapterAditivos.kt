package com.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmpindustriais.R

import com.model.Aditivos

class AdapterAditivos (private val context: Context, private val aditivos:MutableList<Aditivos>): RecyclerView.Adapter<AdapterAditivos.AditivosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AditivosViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.aditivos_item, parent, false)
        val holder =  AditivosViewHolder(itemLista)
        return holder
    }
    override fun getItemCount(): Int =  aditivos.size


    override fun onBindViewHolder(holder: AditivosViewHolder, position: Int) {
        holder.foto.setImageResource(aditivos[position].foto)
        holder.descricao.text =  aditivos[position].descricao
        holder.aplicacao.text = aditivos[position].aplicacao
    }
    inner class AditivosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_aditivos)
        val descricao = itemView.findViewById<TextView>(R.id.nome_descrição)
        val aplicacao = itemView.findViewById<TextView>(R.id.aplicações)
    }
}