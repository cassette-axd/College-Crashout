package org.acjn.crashout

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.UIKitViewController
import androidx.compose.ui.window.ComposeUIViewController
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIViewController

fun MainViewController(
    mapUIViewController: () -> UIViewController
) = ComposeUIViewController {
    mapViewController = mapUIViewController
    Login()
}

lateinit var mapViewController: () -> UIViewController

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun MapComponent() {
    UIKitViewController(
        factory = mapViewController,
        modifier = Modifier.fillMaxSize(),
    )
}

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun Profile(userName: String, password: String) {
    UIKitViewController(
        factory = mapViewController,
        modifier = Modifier.fillMaxSize(),
    )
}

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun Target() {
    UIKitViewController(
        factory = mapViewController,
        modifier = Modifier.fillMaxSize(),
    )
}