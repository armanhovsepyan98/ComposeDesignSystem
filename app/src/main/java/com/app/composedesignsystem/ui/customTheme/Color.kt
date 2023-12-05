package com.app.composedesignsystem.ui.customTheme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class AppColorScheme(
    val screenBackground: Color,
    val toolbarColor: Color,
    val buttonBackground: Color,
    val textColor: Color,
    val buttonTextColor: Color,
    val lineColor: Color,
    val circleColor: Color,
)

val LocalAppColorScheme = staticCompositionLocalOf {
    AppColorScheme(
        toolbarColor = Color.Unspecified,
        screenBackground = Color.Unspecified,
        buttonBackground = Color.Unspecified,
        textColor = Color.Unspecified,
        lineColor = Color.Unspecified,
        circleColor = Color.Unspecified,
        buttonTextColor = Color.Unspecified,
    )
}
val darkColor = AppColorScheme(
    screenBackground = Color(0xFF15085F),
    toolbarColor = Color(0xFF004ED5),
    buttonBackground = Color(0xFFFFFFFF),
    textColor = Color(0xFFFFFFFF),
    lineColor = Color(0xFFFFFFFF),
    circleColor = Color(0xFFFFFFFF),
    buttonTextColor = Color(0xFF0037FF),
)

val lightColor = AppColorScheme(
    screenBackground = Color(0xFFFFFFFF),
    toolbarColor = Color(0xFF004ED5),
    buttonBackground = Color(0xFF0037FF),
    textColor = Color(0xFF0037FF),
    lineColor = Color(0xFF004ED5),
    circleColor = Color(0xFF0037FF),
    buttonTextColor = Color(0xFFFFFFFF),
)
