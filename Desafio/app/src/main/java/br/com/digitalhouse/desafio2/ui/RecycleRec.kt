package br.com.digitalhouse.desafio2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.desafio2.R
import br.com.digitalhouse.desafio2.domain.Receita
import kotlinx.android.synthetic.main.rec.view.*

class RecycleRec(private val listRec: ArrayList<Receita>, private val listener: OnItemClickListenerPrato): RecyclerView.Adapter<RecycleRec.RecList>()  {
    inner class RecList(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val img: ImageView = itemView.item
        val name: TextView = itemView.item2
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
    override fun getItemCount() = listRec.size

    interface OnItemClickListenerPrato {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecList {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rec, parent, false)
        return RecList(view)
    }

    override fun onBindViewHolder(holder: RecList, position: Int) {
        val i = listRec[position]
        holder.name.text = i.name
        holder.img.setImageResource(i.imagem)

    }


}