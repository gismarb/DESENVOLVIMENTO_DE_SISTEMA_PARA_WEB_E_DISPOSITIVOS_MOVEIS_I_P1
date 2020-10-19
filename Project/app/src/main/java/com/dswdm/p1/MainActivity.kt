package com.dswdm.p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


// Mensagem de falha de Login
const val LOGIN_FAILURE_MESSAGE = "Atenção - e-mail/CPF e/ou senha inválidos"
//const val USER_LOGIN_DD

// Instanciando a Objetos para guardar usuários cadastrados "injetados"
val userData = User("Gismar Barbosa", "111111111-22", "gismar@gismar.com", "g1sma@r")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //TODO: Modificar o instanciamento da variáveis para receber dados da classe criada (User).

    // Função para validar Login
    fun validateAccess(view: View) {
        val editTextId = findViewById<EditText>(R.id.editTextUserId)
        val userId = editTextId.text.toString()

        val editTextPwd = findViewById<EditText>(R.id.editTextUserPwd)
        val userPwd = editTextPwd.text.toString()

    }
}