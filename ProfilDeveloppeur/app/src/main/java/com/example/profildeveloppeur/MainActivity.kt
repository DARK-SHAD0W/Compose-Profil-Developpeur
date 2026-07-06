package com.example.profildeveloppeur

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.profildeveloppeur.ui.profil.PageProfil
import com.example.profildeveloppeur.ui.theme.ProfilDeveloppeurTheme

// Active le thème puis affiche PageProfil dans un Scaffold.
// Aperçus (@Preview) : voir CarteProfil.kt dans ui/profil.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilDeveloppeurTheme {
                // innerPadding = padding externe fourni par le Scaffold (barres système).
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PageProfil(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
