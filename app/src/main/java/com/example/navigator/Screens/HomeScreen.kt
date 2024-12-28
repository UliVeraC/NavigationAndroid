package com.example.navigator.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
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
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.padding(padding).fillMaxSize()) {
            Text(
                "Go to Second Screend",
                fontSize = 25.sp,
                color = Color.White,
                modifier = Modifier
                    .background(color = Color.DarkGray)
                    .padding(16.dp)

            )
        }
    }
}