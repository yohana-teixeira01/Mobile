package com.teixeirayohana.roadmapsmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class TermosDeUso : AppCompatActivity() {

    private lateinit var proximo:Button
    private lateinit var continuar: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_termos_de_uso)

        proximo= findViewById(R.id.button2);
        continuar=findViewById(R.id.checkBox)

        proximo.setOnClickListener {
            startActivity(Intent(this, MainCidadesActivity::class.java))
            Toast.makeText(this, "Clicado em Próximo", Toast.LENGTH_SHORT).show()
        }

        continuar.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                proximo.setEnabled(true)
            } else {
                proximo.setEnabled(false)
            }
        }
    }

}