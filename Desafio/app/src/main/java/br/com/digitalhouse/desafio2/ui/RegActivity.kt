package br.com.digitalhouse.desafio2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.digitalhouse.desafio2.R
import br.com.digitalhouse.desafio2.domain.Usuario
import kotlinx.android.synthetic.main.cadastro_body.*

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadas)

        btn_cadastrar.setOnClickListener {
            callMain(getInformationUser())
        }
    }

    fun getInformationUser(): Usuario {
        val username = edUserName.text.toString()
        val senha = edPassword.text.toString()

        return Usuario(1, username, senha)
    }

    //Chama MainActivity
    fun callMain(usuario: Usuario){
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", usuario)
        startActivity(intent)
    }
}