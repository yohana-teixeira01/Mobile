package com.teixeirayohana.roadmapsmobile


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainCadastroActivity : AppCompatActivity() {

    private lateinit var nome:EditText
    private lateinit var idade:EditText
    private lateinit var email:EditText
    private lateinit var endereco:EditText
    private lateinit var senha:EditText
    private lateinit var proximo:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_cadastro)

        nome = findViewById(R.id.editTextTextPersonName);
        idade = findViewById(R.id.editTextNumber);
        email = findViewById(R.id.editTextTextEmailAddress);
        endereco = findViewById(R.id.editTextTextPersonName2);
        senha = findViewById(R.id.editTextTextPassword);
        proximo  = findViewById(R.id.button);

        proximo.setOnClickListener {
            Toast.makeText(this, "Clicado em Próximo", Toast.LENGTH_SHORT).show()

        }

        //Por hora o dialogo que conseguir foi esse!
        senha.setOnClickListener {
            Toast.makeText(this, "A senha deve possuir mais de 5 caracteres!", Toast.LENGTH_SHORT).show()
        }

        nome.addTextChangedListener(textWatcher)
        idade.addTextChangedListener(textWatcher)
        email.addTextChangedListener(textWatcher)
        endereco.addTextChangedListener(textWatcher)
        senha.addTextChangedListener(textWatcher)

    }


    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            val nome = nome.text.toString().trim()
            val idade = idade.text.toString().trim()
            val email = email.text.toString().trim()
            val endereco = endereco.text.toString().trim()
            val senha = senha.text.toString().trim()



            if(senha.length > 5){
                proximo.isEnabled = nome.isNotEmpty() && idade.isNotEmpty() && email.isNotEmpty() && endereco.isNotEmpty() && senha.isNotEmpty()
            }else{
                proximo.isEnabled = false



            }


        }


    }




}