package com.example.ejmplologsec1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Buscamos el botón por su id
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val txtNum = findViewById<TextView>(R.id.tvNumero)

        btnSumar.setOnClickListener {
            val numero = txtNum.text.toString().toInt() + 1
            txtNum.text = numero.toString()
            Log.d("Función sumar", "El numero es: "+numero)
        }

    }

}