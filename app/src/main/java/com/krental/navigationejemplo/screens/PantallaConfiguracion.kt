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
fun PantallaConfiguracion(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id= R.drawable.configuracion),
            contentDescription = "Icono de configuracion",
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text="Pantalla Configuracion")
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                navController.navigate("pantallaLogin"){
                    popUpTo(0)
                    //Cerrar sesion. Ir a la pantalla login.
                    //Se elimina de la pila todas las pantallas
                    //menos la primera
                }
            }
        ){
            Text (text="Cerrar sesion (logout)")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {
                navController.navigate("pantallaInicio") {
                    popUpTo("pantallaPerfil") {
                        inclusive = true
                        //Va eliminar a pantalla perfil y ttodo lo que este
                        //por encima
                    }
                }
            }
        ){
            Text (text="Volver a inicio")
        }
    }
}