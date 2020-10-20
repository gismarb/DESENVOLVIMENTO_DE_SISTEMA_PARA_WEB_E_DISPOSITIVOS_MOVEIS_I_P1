package com.dswdm.p1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.EditText
import android.widget.TextView


// Mensagem de falha de Login
const val LOGIN_FAILURE_MESSAGE = "Atenção: e-mail/CPF e/ou senha inválidos"
//const val USER_LOGIN_DD

// Instanciando a Objetos para guardar usuários cadastrados "injetados"
val user1 = User("Gismar Barbosa", "111111111-22", "gismar@gismar.com", "g1sm@r" )
//val user2 = User("Ricardo Severiano Motta", "111111110-20", "ricardo@best.com.br", "r1c@rd0" )
//val user3 = User("Marta Helena Richaauskka", "81111111-99", "mhrichaauskka@idle.com", "m@rt@H" )
// Avaliar se irá usar uma lista
//val users = listOf<User>(user1, user2, user3)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //TODO: Modificar o instanciamento da variáveis para receber dados da classe criada (User). OK

    // Função para validar Login
    fun validateAccess(view: View) {
        val editTextId = findViewById<EditText>(R.id.editTextUserId)
        val userId = editTextId.text.toString()

        val editTextPwd = findViewById<EditText>(R.id.editTextUserPwd)
        val userPwd = editTextPwd.text.toString()

//        Pensar em um limitador para os erros
//        val editTextFail = findViewById<TextView>(R.id.textViewErrorLogin)
//        editTextFail.append(LOGIN_FAILURE_MESSAGE)


        if (userPwd.equals(user1.pwd) and userId.equals(user1.email) or userId.equals(user1.CPF)) {
            val intent = Intent(this, DataFormActivity::class.java)
            startActivity(intent)
        } else {
//            TODO: Repassar dados para uma TextView (neste caso, mensagem de erro para TextView)
//            findViewById<TextView>(R.id.textViewErrorLogin) = LOGIN_FAILURE_MESSAGE
        }

    }

}