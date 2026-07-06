package com.example.profildeveloppeur.ui.profil

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

// Zone cliquable personnalisée (info + action) : chaîne largeur → padding →
// clic → sémantique, avec Role.Button et contentDescription pour un lecteur d'écran.
@Composable
fun StatutDisponibilite(
    texte: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Text(
        text = texte,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable(role = Role.Button, onClick = onClick)
            .semantics {
                contentDescription = "Disponibilité : $texte"
            }
    )
}
