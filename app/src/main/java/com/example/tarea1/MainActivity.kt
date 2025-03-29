package com.example.tarea1

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tarea1.ui.theme.Tarea1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding) .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                        )
                        InicioApp()
                        PrimerString()
                        SegundoString()
                        TercerString()
                        Imagen1()
                        Imagen2()
                        Imagen3()
                    }
                }
            }
        }
    }
}

@Composable
fun InicioApp(modifier: Modifier = Modifier){
    Log.d("Inicio", "Mi aplicacion - Tarea 1 inicio")
    val name = stringResource(R.string.app_name)
    Text(
        text = "$name!",
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarea1Theme {
        Greeting("Android")
    }
}

@Composable
fun PrimerString(modifier: Modifier = Modifier){
    Log.d("String 1", "Bienvenido a la Aplicación")
    val name = stringResource(R.string.string1)
    Text(
        text = "Bienvenido a la Aplicación",
    )
}

@Composable
fun SegundoString(modifier: Modifier = Modifier){
    Log.d("String 2", "Explorando recursos en Android!")
    val name = stringResource(R.string.string2)
    Text(
        text = "Explorando recursos en Android!",
    )
}

@Composable
fun TercerString(modifier: Modifier = Modifier){
    Log.d("String 3", "Mi nombre es %s")
    val name = stringResource(R.string.string3, "Juan")
    Text(
        text = "$name",
    )
}

@Composable
fun Imagen1(){
    Log.d("Imagen 1", "Gato Meme")
    Image(modifier = Modifier.height( height = 200.dp) .width( width = 200.dp),
        painter = painterResource(id = R.drawable.imagen1),
        contentDescription = "Gato Meme",
        )
}

@Composable
fun Imagen2(){
    Log.d("Imagen 2", "Raton Meme")
    Image(modifier = Modifier.height( height = 200.dp) .width( width = 200.dp),
        painter = painterResource(id = R.drawable.imagen2),
        contentDescription = "Android Logo")
}

@Composable
fun Imagen3(){
    Log.d("Imagen 3", "Perro Meme")
    Image(modifier = Modifier.height( height = 200.dp) .width( width = 200.dp),
        painter = painterResource(id = R.drawable.imagen3),
        contentDescription = "Android Logo")
}