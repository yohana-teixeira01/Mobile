package com.teixeirayohana.roadmapsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.teixeirayohana.roadmapsmobile.databinding.ActivityMainCidadesBinding



class MainCidadesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainCidadesBinding
    private lateinit var cidadesArrayList : ArrayList<Cidades>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainCidadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.recife,R.drawable.valencia,R.drawable.cuernavaca,R.drawable.detroit,R.drawable.kingston,
            R.drawable.salvador,R.drawable.new_orleans,R.drawable.medellin,R.drawable.victoria,R.drawable.caracas
        )

        val nameCidade = arrayOf(
            "Recife",
            "Valencia",
            "Cuernavaca",
            "Detroit",
            "Kingston",
            "Salvador",
            "New Orleans",
            "Medellin",
            "Victoria",
            "Caracas"
        )

        val namePais = arrayOf(
            "Brasil",
            "Venezuela",
            "México",
            "Estados Unidos",
            "Jamaica",
            "Brasil",
            "Estados Unidos",
            "Colômbia",
            "México",
            "Venezuela"
        )

        cidadesArrayList = ArrayList()

        for (i in nameCidade.indices){

            val cidades =Cidades(nameCidade[i],namePais[i],imageId[i])
            cidadesArrayList.add(cidades)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = CidadeAdapter(this,cidadesArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val nameCidade = nameCidade[position]
            val namePais = namePais[position]
            val imageId = imageId[position]
            Toast.makeText(this, "Clicado em Detalhes", Toast.LENGTH_SHORT).show()

            val i = Intent(this, CidadesActivity::class.java)
            i.putExtra("nameCidade",nameCidade)
            i.putExtra("namePais",namePais)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }

    }

}