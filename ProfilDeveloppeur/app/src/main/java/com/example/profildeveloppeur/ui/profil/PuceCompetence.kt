package com.example.profildeveloppeur.ui.profil

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.profildeveloppeur.ui.theme.FondCompetence

// Une compétence, sur un fond clair qui la distingue du reste de la carte ;
// réutilisée pour chaque élément de la liste.
@Composable
fun PuceCompetence(
    competence: String,
    modifier: Modifier = Modifier
) {
    Surface(
        color = FondCompetence,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp)
    ) {
        Text(
            text = "- $competence",
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
    }
}
