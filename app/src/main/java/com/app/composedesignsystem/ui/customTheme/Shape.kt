package com.app.composedesignsystem.ui.customTheme

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class AppShape(
    val rectangleShapeButton: Shape,
    val circleShapeButton: Shape,
)

val LocalAppShape = staticCompositionLocalOf {
    AppShape(
        rectangleShapeButton = RectangleShape,
        circleShapeButton = CircleShape
    )
}

val shape = AppShape(
    rectangleShapeButton = RectangleShape,
    circleShapeButton = CircleShape,
)