package com.alonsodelcid.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow
import kotlin.math.roundToLong
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_calcular.setOnClickListener{hipotenusa()}
        bt_Limpiar.setOnClickListener{limpiar()}

    }

    private fun limpiar() {
        txn_catetoC.text.clear()
        txn_catetoB.text.clear()
    }

    private fun hipotenusa() {
        var catetoC = txn_catetoC.text.toString()
        var catetoB = txn_catetoB.text.toString()

        if((catetoC != "") or (catetoB != " ")){
            var hipotenusa = catetoC.toDouble().pow(2) + catetoB.toDouble().pow(2)
            hipotenusa = sqrt(hipotenusa)

            Toast.makeText(this, "La medidad de la hipotenusa es: ".plus(hipotenusa.toString()), Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Campo vacio. Favor de revisar", Toast.LENGTH_LONG).show()
        }
    }
}