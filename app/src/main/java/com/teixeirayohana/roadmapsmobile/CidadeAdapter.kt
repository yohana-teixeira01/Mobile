package com.teixeirayohana.roadmapsmobile

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CidadeAdapter(private  val context : Activity,private val arrayList: ArrayList<Cidades>) : ArrayAdapter<Cidades>(context,
    R.layout.list_item,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView: ImageView = view.findViewById(R.id.profile_pic)
        val namecidade : TextView = view.findViewById(R.id.nameCidade)
        val namepais : TextView = view.findViewById(R.id.namePais)

        imageView.setImageResource(arrayList[position].imageId)
        namecidade.text = arrayList[position].nameCidade
        namepais.text = arrayList[position].namePais

        return view
    }
}