package com.example.profildeveloppeur.ui.profil

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// Nom et rôle du développeur, l'un sous l'autre.
@Composable
fun IdentiteDeveloppeur(
    nom: String,
    role: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = nom)
        Text(text = role)
    }
}
