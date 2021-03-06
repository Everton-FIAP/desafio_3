package com.example.desafio_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rbMasculino = findViewById<RadioButton>(R.id.rbMasculino)
        val txtAltura = findViewById<RadioButton>(R.id.rbMasculino)
        val btnPesoIdeal = findViewById<Button>(R.id.btnPesoIdeal)

        btnPesoIdeal.setOnClickListener{
            val altura = txtAltura.text.toString().toDouble()
            val pesoIdeal: Double

            if(rbMasculino.isChecked){
                pesoIdeal  = (72.7 * altura) - 58
            }else{
                pesoIdeal = (62.1 * altura) - 44.7
            }

            val dec: DecimalFormat = DecimalFormat("#.00")
            val msg = "Peso Ideal ${dec.format(pesoIdeal)} kg"
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }
}