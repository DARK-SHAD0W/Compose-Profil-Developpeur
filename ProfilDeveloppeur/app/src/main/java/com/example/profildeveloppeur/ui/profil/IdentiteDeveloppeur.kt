package com.example.profildeveloppeur.ui.profil

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.profildeveloppeur.ui.theme.FondEntete

// Nom et rôle du développeur, sur un fond clair propre à ce composable.
@Composable
fun IdentiteDeveloppeur(
    nom: String,
    role: String,
    modifier: Modifier = Modifier
) {
    Surface(color = FondEntete, modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(text = nom)
            Text(text = role)
        }
    }
}
