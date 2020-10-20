package com.dswdm.p1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

// TAGs usadas nos TextView do formulário.
const val NAME_TAG = "Nome: "
const val CPF_TAG = "CPF: "
const val EMAIL_TAG = "E-mail: "

// Instanciando a Objetos para guardar usuários cadastrados "injetados"
public val user1 = User("Adonis Valdez", "111111111-22", "adonis@anydomain.com", "0123456789")

// TODO: Pensar em uma forma de utilizar uma Lista, para alocar mais usuários (futuro)
//val user2 = User("Ricardo Severiano Motta", "111111110-20", "ricardo@best.com.br", "r1c@rd0" )
//val user3 = User("Marta Helena Richaauskka", "81111111-99", "mhrichaauskka@idle.com", "m@rt@H" )
//public val users = listOf<User>(user1, user2, user3)

class DataFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dataform)
    }

    // Função para mostrar os dados do Formulário
    fun showDataFom(View: View){

        // Atribuindo, recebendo e/ou enviando valores das váriaveis
        // para os componentes da View (activity_dataform.xml)

        // Campo: Nome
        val textViewNameUser = findViewById<TextView>(R.id.textViewName)

        // Campo: CPF
        val textViewCPFUser = findViewById<TextView>(R.id.textViewCPF)

        // Campo: e-mail
        val textViewEmailUser = findViewById<TextView>(R.id.textViewEmail)

        // Concatenando rótulos dos campos com dados do Objeto User (injetados manualmente)
        textViewNameUser.setText(NAME_TAG + user1.name)
        textViewCPFUser.setText(CPF_TAG + user1.CPF)
        textViewEmailUser.setText(EMAIL_TAG + user1.email)

        // Tempo para executar a finalização da função
        // Recurso para criar alusão à "tempo de processamento"
        Thread.sleep(500)

    }

    // Função para recurso de voltar para tela anterior
    fun backToLogin(View: View) {

        // Atribuindo, recebendo e/ou enviando valores das váriaveis
        // para os componentes da View (activity_dataform.xml)

        // Campo: Nome
        val textViewNameUser = findViewById<TextView>(R.id.textViewName)

        // Campo: CPF
        val textViewCPFUser = findViewById<TextView>(R.id.textViewCPF)

        // Campo: e-mail
        val textViewEmailUser = findViewById<TextView>(R.id.textViewEmail)

        // Criando o link com a tela antrior (voltar)
        val intent = Intent(this, MainActivity::class.java)

        //  Limapando dados dos campos
        textViewNameUser.setText("")
        textViewCPFUser.setText("")
        textViewEmailUser.setText("")

        // Carregando tela anterior (activity_mian.xml)
        startActivity(intent)

        // Tempo para voltar à tela anterior
        Thread.sleep(500)

    }



}