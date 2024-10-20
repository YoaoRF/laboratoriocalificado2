
package com.rodriguez.yoao.laboratoriocalificado02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ejercicio02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)  // Usa el layout XML

        // Vincula los elementos del layout
        val inputNombre = findViewById<EditText>(R.id.inputNombre)
        val inputProductos = findViewById<EditText>(R.id.inputProductos)
        val inputDireccion = findViewById<EditText>(R.id.inputDireccion)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val btnLlamar = findViewById<Button>(R.id.btnLlamar)
        val btnWhatsapp = findViewById<Button>(R.id.btnWhatsapp)
        val btnMaps = findViewById<Button>(R.id.btnMaps)

        // Acción para el botón de Registrar
        btnRegistrar.setOnClickListener {
            val nombre = inputNombre.text.toString()
            val productos = inputProductos.text.toString()
            val direccion = inputDireccion.text.toString()

            if (nombre.isEmpty() || productos.isEmpty() || direccion.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
                // Aquí se podrías realizar alguna acción como guardar los datos o mostrar otra pantalla
            }
        }

        // Acción para el botón de Llamar
        btnLlamar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:123456789")  // Número de teléfono ficticio
            }
            startActivity(intent)
        }

        // Acción para el botón de WhatsApp
        btnWhatsapp.setOnClickListener {
            val nombre = inputNombre.text.toString()
            val productos = inputProductos.text.toString()
            val direccion = inputDireccion.text.toString()

            val mensaje = "Hola $nombre, tus productos: $productos están en camino a la dirección: $direccion"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://wa.me/?text=${Uri.encode(mensaje)}")
            }
            startActivity(intent)
        }

        // Acción para el botón de Google Maps
        btnMaps.setOnClickListener {
            val direccion = inputDireccion.text.toString()
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("geo:0,0?q=${Uri.encode(direccion)}")
            }
            startActivity(intent)
        }
    }
}
