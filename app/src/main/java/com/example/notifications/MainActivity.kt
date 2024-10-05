package com.example.notifications

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val button: Button by lazy {
        findViewById<Button>(R.id.button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mostrar un Toast con mensaje personalizado
        button.setOnClickListener {
            Toast.makeText(this, "¡Mensaje personalizado!", Toast.LENGTH_SHORT).show()

            // Mostrar un Snackbar con mensaje
            Snackbar.make(findViewById(android.R.id.content), "Este es un Snackbar", Snackbar.LENGTH_LONG).show()
        }
    }
}
