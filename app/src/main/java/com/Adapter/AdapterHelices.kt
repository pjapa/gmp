package com.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmpindustriais.R
import com.model.Helices
import com.model.Moinhos

class AdapterHelices (private val context: Context, private val helices:MutableList<Helices>): RecyclerView.Adapter<AdapterHelices. HelicesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelicesViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.moinhos_item, parent, false)
        val holder =  HelicesViewHolder(itemLista)
        return holder
    }
    override fun getItemCount(): Int =  helices.size


    override fun onBindViewHolder(holder:HelicesViewHolder, position: Int) {
        holder.foto.setImageResource(helices[position].foto)
        holder.descricao.text = helices[position].descricao
        holder.aplicacao.text = helices[position].aplicacao
    }
    inner class HelicesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_moinhos)
        val descricao = itemView.findViewById<TextView>(R.id.nome_descrição)
        val aplicacao = itemView.findViewById<TextView>(R.id.aplicações)
    }
}