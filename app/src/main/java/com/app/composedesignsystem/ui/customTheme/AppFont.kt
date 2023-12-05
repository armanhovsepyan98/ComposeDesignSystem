package com.app.composedesignsystem.ui.customTheme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.app.composedesignsystem.R

data class AppTypography(
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleNormal: TextStyle,
    val titleSmall: TextStyle,
    val buttonTextStyle: TextStyle,
)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleNormal = TextStyle.Default,
        titleSmall = TextStyle.Default,
        buttonTextStyle = TextStyle.Default,
    )
}

val CustomFonts = FontFamily(
    Font(R.font.open_sans_bold, FontWeight.Bold),
    Font(R.font.open_sans_regular, FontWeight.Normal),
    Font(R.font.open_sans_semibold, FontWeight.SemiBold)
)

val typography = AppTypography(
    titleLarge = TextStyle(
        fontFamily = CustomFonts,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    titleMedium = TextStyle(
        fontFamily = CustomFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 26.sp
    ),
    titleNormal = TextStyle(
        fontFamily = CustomFonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),
    titleSmall = TextStyle(
        fontFamily = CustomFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    buttonTextStyle = TextStyle(
        fontFamily = CustomFonts,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
)