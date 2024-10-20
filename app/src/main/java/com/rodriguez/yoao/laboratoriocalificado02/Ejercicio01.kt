package com.rodriguez.yoao.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.rodriguez.yoao.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity() {

    // Declaración de la variable para el binding
    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el binding utilizando el layout correspondiente
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)

        // Configurar la vista raíz usando el binding
        setContentView(binding.root)

        // Botón Mostrar: Cambia la visibilidad del view verde a "VISIBLE"
        binding.buttonMostrar.setOnClickListener {
            binding.viewVerde.visibility = View.VISIBLE
        }

        // Botón Ocultar: Cambia la visibilidad del view verde a "GONE"
        binding.buttonOcultar.setOnClickListener {
            binding.viewVerde.visibility = View.GONE
        }
    }
}
