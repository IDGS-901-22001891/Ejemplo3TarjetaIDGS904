package com.example.ejemplo3tarjetaidgs904.Segmentacion

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp



@Composable
fun MyPersonajes(personaje: CardPersonaje){
    Card (
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(), // Add fillMaxWidth to make the card take full width
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer) // Use a color from your theme or Color.Blue
    ) {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background) // Row background can be different if needed
        ) {
            ImagenHeroe(personaje.title) // Pass the image resource ID
            Personajes(personaje)
        }
    }
}

@Composable
fun Personajes(personaje: CardPersonaje){
    Column {
        Personaje(personaje.title,
            MaterialTheme.colorScheme.primary,
            MaterialTheme.typography.titleLarge)
        Personaje(personaje.body,
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun Personaje(name: String, color: Color, style: TextStyle){
    Text(text = name)
}

