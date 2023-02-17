package com.example.customlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv1 = findViewById<ListView>(R.id.lv1)


        val list = ArrayList<Model>()
        list.add(Model("Rhopalocera", "Butterflies are insects that have large, often brightly coloured wings, and a conspicuous, fluttering flight. The group comprises the superfamilies Hedyloidea and Papilionoidea. Butterfly fossils date to the Paleocene, about 56 million years ago.", R.drawable.butterfly))



        lv1.adapter = MyCustomAdapter(this, R.layout.compat_layout, list)

    }
}