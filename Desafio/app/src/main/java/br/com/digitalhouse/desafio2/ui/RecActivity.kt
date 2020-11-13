package br.com.digitalhouse.desafio2.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.digitalhouse.desafio2.R
import kotlinx.android.synthetic.main.activity_rec.*

class RecActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec)
        voltarDetalhe.setOnClickListener {
            startActivity(Intent(this, InfActivity::class.java))
        }
        viewimg3.text = intent.extras!!.getString("Descrição")

    }
}