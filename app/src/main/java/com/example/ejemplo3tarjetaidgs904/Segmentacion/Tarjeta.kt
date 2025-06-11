package com.example.ejemplo3tarjetaidgs904.Segmentacion

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable


@Composable
fun Tarjeta(personajes:List<CardPersonaje>){
    LazyColumn {
        items (personajes) { personaje ->
            MyPersonajes(personaje)
        }
    }
}
