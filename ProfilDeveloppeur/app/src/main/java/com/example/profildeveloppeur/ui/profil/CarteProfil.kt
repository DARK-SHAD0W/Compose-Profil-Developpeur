package com.example.profildeveloppeur.ui.profil

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profildeveloppeur.ui.theme.FondCarte
import com.example.profildeveloppeur.ui.theme.ProfilDeveloppeurTheme

// Assemble la fiche complète ; padding(20.dp) est le padding interne de la carte,
// indépendant de l'endroit où le parent place la carte à l'écran.
@Composable
fun CarteProfil(
    nom: String,
    role: String,
    description: String,
    competences: List<String>,
    disponibilite: String,
    texteAction: String,
    onDisponibiliteClick: () -> Unit,
    onContacterClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier, color = FondCarte) {
        Column(modifier = Modifier.padding(20.dp)) {
            IdentiteDeveloppeur(nom = nom, role = role)
            Text(
                text = description,
                modifier = Modifier.padding(top = 12.dp, bottom = 12.dp)
            )
            competences.forEach { competence ->
                PuceCompetence(competence = competence)
            }
            StatutDisponibilite(
                texte = disponibilite,
                onClick = onDisponibiliteClick,
                modifier = Modifier.padding(top = 12.dp)
            )
            ActionContact(
                texte = texteAction,
                onClick = onContacterClick,
                modifier = Modifier.padding(top = 12.dp)
            )
        }
    }
}

// Profil junior, disponible pour un stage.
@Preview(showBackground = true, name = "Profil junior disponible")
@Composable
fun ApercuProfilJunior() {
    ProfilDeveloppeurTheme {
        CarteProfil(
            nom = "Ahmed",
            role = "Développeur Android",
            description = "Étudiant en informatique, actuellement en train d'apprendre " +
                "Jetpack Compose pour créer des interfaces Android modernes.",
            competences = listOf("Kotlin", "Jetpack Compose", "Git"),
            disponibilite = "Recherche de stage",
            texteAction = "Contacter",
            onDisponibiliteClick = {},
            onContacterClick = {},
            modifier = Modifier.padding(16.dp)
        )
    }
}

// Profil expérimenté, non disponible, compétences différentes.
@Preview(showBackground = true, name = "Profil expérimenté non disponible")
@Composable
fun ApercuProfilExperimente() {
    ProfilDeveloppeurTheme {
        CarteProfil(
            nom = "Sofia Martin",
            role = "Développeuse full-stack",
            description = "Développeuse expérimentée, à l'aise aussi bien côté serveur " +
                "que sur les interfaces mobiles.",
            competences = listOf("Kotlin", "Node.js", "PostgreSQL"),
            disponibilite = "Non disponible actuellement",
            texteAction = "Voir le portfolio",
            onDisponibiliteClick = {},
            onContacterClick = {},
            modifier = Modifier.padding(16.dp)
        )
    }
}
