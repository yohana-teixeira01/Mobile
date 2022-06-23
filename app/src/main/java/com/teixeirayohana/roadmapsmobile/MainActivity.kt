package com.teixeirayohana.roadmapsmobile

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(Runnable(){
            kotlin.run {
                startActivity(Intent(applicationContext,MainCadastroActivity::class.java))
                finish()
            }
        }, 5000);


    }
}