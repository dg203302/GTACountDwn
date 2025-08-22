package com.example.gtvicountdown

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            var pestAct by remember { mutableStateOf(0) }
            Scaffold(
                topBar = { TopAppBar(title = { Text("GTA VI CountDown") }) },
                bottomBar = {
                    NavigationBar {
                        NavigationBarItem(
                            selected = pestAct == 0,
                            onClick = { pestAct = 0 },
                            icon = { Icon(Icons.Filled.Home, contentDescription = "Inicio") },
                            label = { Text("Countdown") }
                        )
                        NavigationBarItem(
                            selected = pestAct == 1,
                            onClick = { pestAct = 1 },
                            icon = { Icon(Icons.Filled.Settings, contentDescription = "Ajustes") },
                            label = { Text("Info") }
                        )
                    }
                }
            ) { innerPadding ->
                Column(modifier = Modifier.padding(innerPadding)) {
                    when (pestAct) {
                        0 -> {
                            //aca irian las funciones composable para dibujar
                            Text("📅 Pantalla de Inicio - Contador GTA VI")
                            Funcionbton()
                        }
                        1 -> {
                            Text("⚙️ Pantalla de Ajustes (config futura)")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Funcionbton() {
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "¡Hola cumpa!", Toast.LENGTH_SHORT).show()
    }) {
        Text("Saludin")
    }
}