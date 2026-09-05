package com.example.appcontrolefinanceiro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    public fun copiar(view: View){
        val etTitulo = findViewById<EditText>(R.id.etTitulo)
        val etDescricao = findViewById<EditText>(R.id.etDescricao)
        val etValor = findViewById<EditText>(R.id.etValor)
        val etData = findViewById<EditText>(R.id.etData)
        val etCategoria = findViewById<EditText>(R.id.etCategoria)
        val tvAtividade = findViewById<TextView>(R.id.tvAtividade)
        tvAtividade.setText("${etTitulo.text} ${etDescricao.text} ${etValor.text} ${etData.text} ${etCategoria.text}")
    }
}