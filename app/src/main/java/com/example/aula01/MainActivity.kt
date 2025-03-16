package com.example.aula01

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var resultado: TextView? = null
    var primeiroValor: EditText? = null
    var segundoValor: EditText? = null
    //variaveis globais

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //inicializar as variaveis

        resultado = findViewById(R.id.resultado_valor)
        primeiroValor = findViewById(R.id.entrada_valor1)
        segundoValor = findViewById(R.id.entrada_valor2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    // val num1: TextView = findViewByID(edit1_

    fun somar(view: View) {
        val somarConta: TextView = findViewById(R.id.botao_somar)

        val valor1 = primeiroValor?.text.toString()
        val valor2 = segundoValor?.text.toString()
        val num1 = valor1.toDouble()
        val num2 = valor2.toDouble()

        val res = num1 + num2;


        resultado?.setText(String.format("Resultado da soma é: $res"))
    }

        fun subtrair(view: View){
            val subtrairConta = findViewById<TextView>(R.id.botao_subtrair)


            val valor1 = primeiroValor?.text.toString()
            val valor2 = segundoValor?.text.toString()
            val num1 = valor1.toDouble()
            val num2 = valor2.toDouble()

            val res = num1-num2;
            resultado?.setText(String.format("Resultado da subtração é: $res"))
        }
    fun dividir(view: View){
        val dividirConta = findViewById<TextView>(R.id.botao_dividir)


        val valor1 = primeiroValor?.text.toString()
        val valor2 = segundoValor?.text.toString()
        val num1 = valor1.toDouble()
        val num2 = valor2.toDouble()
        if (num1 == 0.0 ){
            Toast.makeText(this,"Divisão por 0! " + num1,Toast.LENGTH_LONG).show()
            return
        }else {
            val res = num1/num2;
            resultado?.setText(String.format("Resultado da divisão é: $res"))
        }
    }
    fun multiplicacao(view: View){
        val multiplicarConta = findViewById<TextView>(R.id.botao_multiplicar)

        val valor1 = primeiroValor?.text.toString()
        val valor2 = segundoValor?.text.toString()
        val num1 = valor1.toDouble()
        val num2 = valor2.toDouble()

        val res = num1*num2;

        resultado?.setText(String.format("Resultado da multilpicação é é: $res"))

    }




    }
