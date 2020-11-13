package br.com.digitalhouse.desafio2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.digitalhouse.desafio2.R
import kotlinx.android.synthetic.main.activity_main.*
import br.com.digitalhouse.desafio2.R.drawable.image1
import br.com.digitalhouse.desafio2.R.drawable.image3
import br.com.digitalhouse.desafio2.R.drawable.image2
import br.com.digitalhouse.desafio2.R.drawable.image4
import br.com.digitalhouse.desafio2.domain.Restaurante


class MainActivity : AppCompatActivity(), RecycleRest.OnItemClickListener {
    private val rest_list = getListaRestaurantes()
    private val adapter = RecycleRest(rest_list, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RecyclerViewRestaurantes.adapter = adapter
        RecyclerViewRestaurantes.layoutManager = LinearLayoutManager(this)
        RecyclerViewRestaurantes.setHasFixedSize(true)
    }
    override fun onItemClick(position: Int) {
        if(position == 0) {
            startActivity(Intent(this, InfActivity::class.java))
        }
    }

    fun getListaRestaurantes(): ArrayList<Restaurante> {
        val rest_names = listOf("Tony Roma's", "Aoyama - Moema",
            "Outback - Moema", "Sí Señor")
        val places_rest = listOf("Av. Lavandisca, 717 - Indianópolis, São Paulo", "Alameda dos Arapanés, 532 - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "Alameda Jauaperi, 626 - Moema")
        val time_rest = listOf("Fecha às 22:00", "Fecha às 00:00",
            "Fecha às 00:00", "Fecha às 01:00")

        var list_rest = arrayListOf(
            Restaurante(image1, rest_names[0], places_rest[0], time_rest[0]),
            Restaurante(image2, rest_names[1], places_rest[1], time_rest[1]),
            Restaurante(image3, rest_names[2], places_rest[2], time_rest[2]),
            Restaurante(image4, rest_names[3], places_rest[3], time_rest[3])
        )
        return list_rest
    }

}