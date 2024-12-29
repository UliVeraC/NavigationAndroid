package com.example.navigator.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navigator.ScreensClass

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.DarkGray,
                onClick = {navController.navigate(ScreensClass.AddScreensClass.name)}) {
                Icon(imageVector = Icons.Default.Add,
                    contentDescription = "Go to second screen",
                    tint = Color.White)
            }
        },

        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.LightGray
                ),
                title = {
                    Text(
                        "Home",
                        color = Color.DarkGray
                    )
                })
        }
    ) { padding ->
        Column (
            modifier = Modifier.padding(padding)
        ) {
            addContact("Ulises", navController)
            Divider()
            addContact("Pedrito", navController)
            Divider()
            addContact("Juanito", navController)
            Divider()
            addContact("Jaimito", navController)
            Divider()
        }
    }
}

@Composable
fun addContact(name: String, navController: NavHostController ){
    Text(text = name,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color.DarkGray,
        modifier = Modifier.padding(16.dp)
            .clickable {
                navController.navigate("${ScreensClass.ContactScreen.name}/$name")
            })


}
