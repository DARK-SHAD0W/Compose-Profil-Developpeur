package com.example.profildeveloppeur.ui.profil

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Écran principal : fournit les données et le padding externe (16.dp) de la fiche,
// c'est-à-dire l'espace que l'écran, en tant que parent, laisse autour de la carte.
@Composable
fun PageProfil(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        CarteProfil(
            nom = "Ahmed",
            role = "Développeur Android",
            description = "Étudiant en informatique, actuellement en train d'apprendre " +
                "Jetpack Compose pour créer des interfaces Android modernes.",
            competences = listOf("Kotlin", "Jetpack Compose", "Git"),
            disponibilite = "Recherche de stage",
            texteAction = "Contacter",
            onDisponibiliteClick = {
                // Callback vide : signale l'événement sans logique applicative,
                // hors du périmètre de ce devoir.
            },
            onContacterClick = {
                // Callback vide, même raison.
            }
        )
        // Autre variante testée pour la capture d'écran (voir aussi les previews
        // dans CarteProfil.kt) :
        // CarteProfil(
        //     nom = "Sofia Martin",
        //     role = "Développeuse full-stack",
        //     description = "Développeuse expérimentée, à l'aise aussi bien côté serveur " +
        //         "que sur les interfaces mobiles.",
        //     competences = listOf("Kotlin", "Node.js", "PostgreSQL"),
        //     disponibilite = "Non disponible actuellement",
        //     texteAction = "Voir le portfolio",
        //     onDisponibiliteClick = {},
        //     onContacterClick = {}
        // )
    }
}
