package com.app.composedesignsystem.ui.customTheme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class AppSize(
    //line
    val longLineSize: Dp,
    val mediumLineSize: Dp,
    val smallLineSize: Dp,

    //circle
    val bigCircleSize: Dp,
    val mediumCircleSize: Dp,
    val smallCircleSize: Dp,

    //button
    val bigButtonSize: Dp,
    val mediumButtonSize: Dp,
    val smallButtonSize: Dp,
)

val LocalAppSize = staticCompositionLocalOf {
    AppSize(
        longLineSize = Dp.Unspecified,
        mediumLineSize = Dp.Unspecified,
        smallLineSize = Dp.Unspecified,
        bigCircleSize = Dp.Unspecified,
        mediumCircleSize = Dp.Unspecified,
        smallCircleSize = Dp.Unspecified,
        bigButtonSize = Dp.Unspecified,
        mediumButtonSize = Dp.Unspecified,
        smallButtonSize = Dp.Unspecified,
    )
}

val size = AppSize(
    longLineSize = 400.dp,
    mediumLineSize = 200.dp,
    smallLineSize = 100.dp,

    bigCircleSize = 150.dp,
    mediumCircleSize = 100.dp,
    smallCircleSize = 50.dp,

    bigButtonSize = 300.dp,
    mediumButtonSize = 200.dp,
    smallButtonSize = 100.dp,
)
