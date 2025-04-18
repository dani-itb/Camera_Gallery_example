package com.example.cameraandgalleryexample.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cameraandgalleryexample.ui.screen.CameraScreen
import com.example.cameraandgalleryexample.ui.screen.PermissionScreen

@Composable
fun NavigationWrapper(){
    val navController = rememberNavController()
    NavHost(navController, Permissions){
        composable<Permissions> {
            PermissionScreen{
                navController.navigate(Camera){
                    popUpTo<Permissions>{ inclusive= true }
                }
            }
        }
        composable<Camera> {
            CameraScreen()
        }
    }
}