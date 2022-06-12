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
import com.model.Moinhos

class AdapterMoinhos (private val context: Context, private val moinhos:MutableList<Moinhos>): RecyclerView.Adapter<AdapterMoinhos. MoinhosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoinhosViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.moinhos_item, parent, false)
        val holder =  MoinhosViewHolder(itemLista)
        return holder
    }
    override fun getItemCount(): Int =  moinhos.size


    override fun onBindViewHolder(holder:MoinhosViewHolder, position: Int) {
        holder.foto.setImageResource(moinhos[position].foto)
        holder.descricao.text =  moinhos[position].descricao
        holder.aplicacao.text = moinhos[position].aplicacao
    }
    inner class MoinhosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.foto_moinhos)
        val descricao = itemView.findViewById<TextView>(R.id.nome_descrição)
        val aplicacao = itemView.findViewById<TextView>(R.id.aplicações)
    }
}