package com.krental.navigationejemplo.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.krental.navigationejemplo.screens.PantallaConfiguracion
import com.krental.navigationejemplo.screens.PantallaDetalle
import com.krental.navigationejemplo.screens.PantallaInicio
import com.krental.navigationejemplo.screens.PantallaLogin
import com.krental.navigationejemplo.screens.PantallaPerfil


@Composable
fun NavGraph(navController: NavHostController, padding: PaddingValues){
    NavHost(
        navController = navController,
        startDestination = "pantallaLogin",
        modifier = Modifier.padding(padding)
    ){
        composable("pantallaLogin") {
            PantallaLogin(navController)
        }
        composable("pantallaInicio") {
            PantallaInicio(navController)
        }
        composable("pantallaPerfil") {
            PantallaPerfil(navController)
        }
        composable("pantallaConfiguracion") {
            PantallaConfiguracion(navController)
        }
        composable(
            route = "pantallaDetalle/{nombreUsuario}",
            arguments = listOf(
                navArgument("nombreUsuario") {
                    type = NavType.StringType
                }
            )
        ){
            backStackEntry ->
                val nombre = backStackEntry.arguments?.getString("nombreUsuario") ?: "Desconocido"

            PantallaDetalle(nombreUsuario = nombre)
        }
    }
}
