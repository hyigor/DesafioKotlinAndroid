package br.com.digitalhouse.desafio2.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.digitalhouse.desafio2.R
import br.com.digitalhouse.desafio2.domain.Usuario
import kotlinx.android.synthetic.main.login_body.*


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnLogin.setOnClickListener{
            callMain(getInformationUser())
        }

        //Click in textView cadastrar
        btnRegister.setOnClickListener{
            callCadastro()
        }
    }
    fun getInformationUser(): Usuario {
        val username = edUserName.text.toString()
        val senha = edPassword.text.toString()

        return Usuario(1, username, senha)
    }

    fun callCadastro(){
        var intent = Intent(this, RegActivity::class.java)
        startActivity(intent)
    }

    fun callMain(usuario: Usuario){
        var intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", usuario)
        startActivity(intent)
    }




}