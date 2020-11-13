package br.com.digitalhouse.desafio2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import br.com.digitalhouse.desafio2.R
import br.com.digitalhouse.desafio2.domain.Receita
import kotlinx.android.synthetic.main.activity_inf.*

class InfActivity : AppCompatActivity(), RecycleRec.OnItemClickListenerPrato {
    private val listRec = getListRec()
    private val adapter = RecycleRec(listRec, this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inf)
        voltar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        Recycler.adapter = adapter
        Recycler.layoutManager = GridLayoutManager(this, 2)
        Recycler.setHasFixedSize(true)
    }
    override fun onItemClick(position: Int) {
        if(position == 0) {
            val i = Intent(this, RecActivity::class.java)
            i.putExtra("Descrição", listRec[position].desc)
            startActivity(i)
        }
    }
    fun getListRec(): ArrayList<Receita> {
        var rec = Receita(R.drawable.image2, "Salada com molho Gengibre", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore")
        var list_rec = arrayListOf(rec, rec, rec, rec, rec, rec, rec, rec, rec, rec, rec, rec)
        return list_rec
    }


}