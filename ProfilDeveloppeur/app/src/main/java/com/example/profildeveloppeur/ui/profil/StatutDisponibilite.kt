package com.example.profildeveloppeur.ui.profil

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.example.profildeveloppeur.ui.theme.FondBadgeDisponibilite

// Zone cliquable personnalisée (info + action), sur fond clair pour se distinguer
// de la carte. Chaîne de modifiers : largeur → clic → sémantique, avec Role.Button
// et contentDescription pour un lecteur d'écran ; le padding interne est sur le Text.
@Composable
fun StatutDisponibilite(
    texte: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        color = FondBadgeDisponibilite,
        modifier = modifier
            .fillMaxWidth()
            .clickable(role = Role.Button, onClick = onClick)
            .semantics {
                contentDescription = "Disponibilité : $texte"
            }
    ) {
        Text(
            text = texte,
            modifier = Modifier.padding(12.dp)
        )
    }
}
