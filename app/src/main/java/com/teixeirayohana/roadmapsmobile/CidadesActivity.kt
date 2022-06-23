package com.teixeirayohana.roadmapsmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.teixeirayohana.roadmapsmobile.databinding.ActivityCidadesBinding


class CidadesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCidadesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCidadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameCidade = intent.getStringExtra("nameCidade")
        val namePais = intent.getStringExtra("namePais")
        val imageId = intent.getIntExtra("imageId",R.drawable.recife)

        binding.nameCidade.text = nameCidade
        binding.namePais.text = namePais
        binding.profileimage.setImageResource(imageId)

    }
}