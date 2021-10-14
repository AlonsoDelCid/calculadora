package com.alonsodelcid.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener{ calcular()}
    }

    private fun calcular() {
        val num1 = numero1.text.toString().toDoubleOrNull()
        val num2 = numero2.text.toString().toDoubleOrNull()

        if((num1 == null) or (num2 == null)){
            Toast.makeText(this, "Los campos no pueden estar vacíos", Toast.LENGTH_LONG).show()
        }
        else{
            var hipo: Double = num1!!.toDouble().pow(2) + num2!!.toDouble().pow(2);
            hipo = sqrt(hipo)
            Toast.makeText(this, "La medida de la hipotenusa es ".plus(hipo.toString()), Toast.LENGTH_LONG).show()
            numero1.text = null
            numero2.text = null
        }
    }
}