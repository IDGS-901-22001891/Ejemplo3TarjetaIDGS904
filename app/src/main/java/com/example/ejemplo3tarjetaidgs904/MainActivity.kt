package com.example.ejemplo3tarjetaidgs904

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplo3tarjetaidgs904.Segmentacion.Tarjeta
import com.example.ejemplo3tarjetaidgs904.Segmentacion.personaaaaajes
import com.example.ejemplo3tarjetaidgs904.Segmentacion.Personajes

import com.example.ejemplo3tarjetaidgs904.ui.theme.Ejemplo3TarjetaIDGS904Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo3TarjetaIDGS904Theme {
                Tarjeta(personaaaaajes)
            }
        }
    }
}
