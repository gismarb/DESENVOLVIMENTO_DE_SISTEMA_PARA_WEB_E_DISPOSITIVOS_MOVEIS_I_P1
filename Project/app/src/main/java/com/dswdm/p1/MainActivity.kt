package com.dswdm.p1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

// Mensagem de falha de Login
const val LOGIN_FAILURE_MESSAGE = "Atenção: e-mail/CPF e/ou senha inválidos"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Função para validar Login
    fun validateAccess(view: View) {

        // Atribuindo, recebendo e/ou enviando valores das váriaveis
        // para os componentes da View (activity_main.xml)

        // Campo: E-mail ou CPF
        val editTextId = findViewById<EditText>(R.id.editTextUserId)
        val userId = editTextId.text.toString()

        // Campo: Senha
        val editTextPwd = findViewById<EditText>(R.id.editTextUserPwd)
        val userPwd = editTextPwd.text.toString()

        // Campo: (mensagem de erro, opcional, caso repasse dados errados)
        val textViewFail = findViewById<TextView>(R.id.textViewErrorLogin)

        // Mecanismo de validação de usuários
        if (userPwd.equals(user1.pwd) and userId.equals(user1.email) or userId.equals(user1.CPF)) {
            val intent = Intent(this, DataFormActivity::class.java)

            // Limpando campo de erro, em caso de sucesso do Login
            textViewFail.setText("")

            // Carregando a outra view (activity_dataform.xml)
            startActivity(intent)
        } else {
            // Caso esteja com crendencias incorretas, carrega mensagem de erro
            textViewFail.setText(LOGIN_FAILURE_MESSAGE)
        }

        // Limapando dados dos campos (credenciais)
        editTextId.setText("")
        editTextPwd.setText("")

        // Tempo para executar a finalização da função
        // Recurso para criar alusão à "tempo de processamento"
        Thread.sleep(500)
    }

}