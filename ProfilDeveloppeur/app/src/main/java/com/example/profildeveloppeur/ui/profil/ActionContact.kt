package com.example.profildeveloppeur.ui.profil

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// Bouton d'action : déjà accessible nativement, pas besoin de sémantique manuelle.
@Composable
fun ActionContact(
    texte: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(onClick = onClick, modifier = modifier) {
        Text(text = texte)
    }
}
