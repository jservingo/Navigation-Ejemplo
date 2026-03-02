package com.krental.navigationejemplo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.krental.navigationejemplo.R

@Composable
fun PantallaPerfil(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id= R.drawable.perfil),
            contentDescription = "Icono de perfil",
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text="Pantalla Perfil")
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                navController.navigate("pantallaConfiguracion"){
                    launchSingleTop = true
                    //Evitar duplicar pantallaConfiguracion
                }
            }
        ){
            Text (text="Ir a configuracion")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                navController.popBackStack()
            }
        ){
            Text (text="Volver atrás")
        }
    }
}