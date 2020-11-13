package br.com.digitalhouse.desafio2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.desafio2.R
import br.com.digitalhouse.desafio2.domain.Restaurante
import kotlinx.android.synthetic.main.rest.view.*

class RecycleRest(private val restList:List<Restaurante>, private val listener: OnItemClickListener): RecyclerView.Adapter<RecycleRest.ListaRestaurantesViewHolder>()  {
    inner class ListaRestaurantesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val img: ImageView = itemView.img
        val name: TextView = itemView.til
        val end: TextView = itemView.det
        val time: TextView = itemView.tim
        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            val pos = adapterPosition
            if (pos != RecyclerView.NO_POSITION) {
                listener.onItemClick(pos)
            }
        }
    }
    override fun getItemCount() = restList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaRestaurantesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rest, parent, false)
        return ListaRestaurantesViewHolder(itemView)
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onBindViewHolder(holder: ListaRestaurantesViewHolder, position: Int) {
        val itemAtual = restList[position]
        holder.img.setImageResource(itemAtual.img)
        holder.name.text = itemAtual.name
        holder.end.text = itemAtual.end
        holder.time.text = itemAtual.time

    }



}