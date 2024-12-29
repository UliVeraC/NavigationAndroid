package com.example.navigator

sealed class ScreensClass (val name: String) {
    object HomeScreensClass: ScreensClass("home")
    object AddScreensClass: ScreensClass("add")
    object ContactScreen: ScreensClass("contact")
}