package edu.itsco.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var numero: EditText
    lateinit var numero2: EditText
    lateinit var calculo: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero = findViewById(R.id.txtnumero)
        numero2 = findViewById(R.id.txtnumero2)
        calculo = findViewById(R.id.txtcalculo)

    }
    fun numero_mayor(x:Int,y:Int):Int{
        if (x>y){
            return x
        }
        else{
            return y
        }
    }

    fun mayor (view:View){
        var x:Int = numero.text.toString().toInt()
        var y:Int = numero2.text.toString().toInt()

        var nummayor:Int=numero_mayor(x,y)
        calculo.setText(nummayor.toString())
    }
}