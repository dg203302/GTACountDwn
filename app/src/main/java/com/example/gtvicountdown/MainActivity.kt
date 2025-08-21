package com.example.gtvicountdown

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                topBar = { TopAppBar(title = { Text("GTA VI CountDown") }) }
                    //bottomBar = {}
                    ) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Text("GTA VI prueba \n poner despues la navegacion por paginas")
                        Funcionbton()
                    }
                }
        }
    }
}
@Composable
fun Funcionbton() {
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "hola niggi", Toast.LENGTH_SHORT).show()
    }) {
        Text("saludin")
    }
}