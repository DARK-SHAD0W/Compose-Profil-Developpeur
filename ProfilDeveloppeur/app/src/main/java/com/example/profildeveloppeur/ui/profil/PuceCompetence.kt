package com.example.profildeveloppeur.ui.profil

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Une compétence, réutilisée pour chaque élément de la liste.
@Composable
fun PuceCompetence(
    competence: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = "- $competence",
        modifier = modifier.padding(vertical = 2.dp)
    )
}
