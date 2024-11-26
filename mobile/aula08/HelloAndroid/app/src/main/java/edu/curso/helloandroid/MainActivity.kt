package edu.curso.helloandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TESTE", "onCreate() executado")

        setContent {
            Quadro()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("TESTE", "onStart() executado")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TESTE", "onResume() executado")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TESTE", "onPause() executado")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TESTE", "onStop() executado")
    }

    override fun onDestroy() {
        Log.i("TESTE", "onDestroy() executado")
        super.onDestroy()
    }
}

@Preview(showBackground = true)
@Composable
fun Quadro() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .border(1.dp,
            color = Color.Blue,
            shape = RoundedCornerShape(15.dp))
        .padding(30.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Text(
                "Nome:",
                fontSize = 18.sp
            )
            OutlinedTextField(
                value = "",
                onValueChange = {}
            )
        }
        Row() {
            Text(
                "Email:",
                fontSize = 18.sp
            )
            OutlinedTextField(
                value = "",
                onValueChange = {}
            )
        }
        Row() {
            Text(
                "Telefone:",
                fontSize = 18.sp
            )
            OutlinedTextField(
                value = "",
                onValueChange = {}
            )
        }
        Button(onClick = {}) {
            Text("Salvar")
        }
    }
}
