package com.app.composedesignsystem

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.app.composedesignsystem.ui.customTheme.AppCustomTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val changeThemeMode = remember { mutableStateOf(false) }
            AppCustomTheme(
                isDarkTheme = changeThemeMode.value
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(AppCustomTheme.colorScheme.screenBackground)
                        .padding(20.dp),
                ) {
                    Column {
                        ThemeSwitcher(changeThemeMode)
                        TextContainer()
                        Spacer(modifier = Modifier.height(20.dp))
                        LineContainer()
                        Spacer(modifier = Modifier.height(20.dp))
                        CircleContainer()
                        Spacer(modifier = Modifier.height(20.dp))
                        ButtonContainer()
                    }
                }
            }
        }
    }
}

@Composable
fun ThemeSwitcher(changeThemeMode: MutableState<Boolean>) {
    Switch(
        checked = changeThemeMode.value,
        onCheckedChange = { isChecked ->
            changeThemeMode.value = isChecked
        }
    )
}

@Composable
fun TextContainer() {
    Column() {
        Text(
            text = "Large Title",
            style = AppCustomTheme.typography.titleLarge,
            color = AppCustomTheme.colorScheme.textColor
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Medium Title",
            style = AppCustomTheme.typography.titleMedium,
            color = AppCustomTheme.colorScheme.textColor,
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Normal Title",
            style = AppCustomTheme.typography.titleNormal,
            color = AppCustomTheme.colorScheme.textColor
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Small Title",
            style = AppCustomTheme.typography.titleSmall,
            color = AppCustomTheme.colorScheme.textColor
        )
    }
}

@Composable
fun LineContainer() {
    Column {
        Spacer(
            modifier = Modifier
                .height(10.dp)
                .width(AppCustomTheme.size.longLineSize)
                .background(AppCustomTheme.colorScheme.lineColor)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Spacer(
            modifier = Modifier
                .height(10.dp)
                .width(AppCustomTheme.size.mediumLineSize)
                .background(AppCustomTheme.colorScheme.lineColor)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Spacer(
            modifier = Modifier
                .height(10.dp)
                .width(AppCustomTheme.size.smallLineSize)
                .background(AppCustomTheme.colorScheme.lineColor)
        )
    }
}

@Composable
fun CircleContainer() {
    Row {
        Box(
            modifier = Modifier
                .size(AppCustomTheme.size.bigCircleSize)
                .background(color = AppCustomTheme.colorScheme.circleColor, shape = CircleShape)
        )
        Spacer(modifier = Modifier.width(5.dp))
        Box(
            modifier = Modifier
                .size(AppCustomTheme.size.mediumCircleSize)
                .background(color = AppCustomTheme.colorScheme.circleColor, shape = CircleShape)
        )
        Spacer(modifier = Modifier.width(5.dp))
        Box(
            modifier = Modifier
                .size(AppCustomTheme.size.smallCircleSize)
                .background(color = AppCustomTheme.colorScheme.circleColor, shape = CircleShape)
        )
    }
}

@Composable
fun ButtonContainer() {
    Column {
        Button(
            modifier = Modifier.width(AppCustomTheme.size.bigButtonSize),
            onClick = {},
            shape = AppCustomTheme.shape.rectangleShapeButton,
            colors = ButtonDefaults.buttonColors(
                containerColor = AppCustomTheme.colorScheme.buttonBackground,
                contentColor = AppCustomTheme.colorScheme.buttonTextColor
            ),
        ) {
            Text(
                text = "Button",
                style = AppCustomTheme.typography.buttonTextStyle
            )
        }
        Spacer(modifier = Modifier.width(5.dp))
        Button(
            modifier = Modifier.width(AppCustomTheme.size.mediumButtonSize),
            onClick = {},
            shape = AppCustomTheme.shape.rectangleShapeButton,
            colors = ButtonDefaults.buttonColors(
                containerColor = AppCustomTheme.colorScheme.buttonBackground,
                contentColor = AppCustomTheme.colorScheme.buttonTextColor
            ),
        ) {
            Text(
                text = "Button",
                style = AppCustomTheme.typography.buttonTextStyle
            )
        }
        Spacer(modifier = Modifier.width(5.dp))
        Button(
            modifier = Modifier.width(AppCustomTheme.size.smallButtonSize),
            onClick = {},
            shape = AppCustomTheme.shape.rectangleShapeButton,
            colors = ButtonDefaults.buttonColors(
                containerColor = AppCustomTheme.colorScheme.buttonBackground,
                contentColor = AppCustomTheme.colorScheme.buttonTextColor
            ),
        ) {
            Text(
                text = "Button",
                style = AppCustomTheme.typography.buttonTextStyle
            )
        }
        Spacer(modifier = Modifier.width(5.dp))
        Button(
            modifier = Modifier.width(AppCustomTheme.size.smallButtonSize),
            onClick = {},
            shape = AppCustomTheme.shape.circleShapeButton,
            colors = ButtonDefaults.buttonColors(
                containerColor = AppCustomTheme.colorScheme.buttonBackground,
                contentColor = AppCustomTheme.colorScheme.buttonTextColor
            ),
        ) {
            Text(
                text = "Button",
                style = AppCustomTheme.typography.buttonTextStyle
            )
        }
        Spacer(modifier = Modifier.width(5.dp))
        Button(
            modifier = Modifier.width(AppCustomTheme.size.mediumButtonSize),
            onClick = {},
            shape = AppCustomTheme.shape.circleShapeButton,
            colors = ButtonDefaults.buttonColors(
                containerColor = AppCustomTheme.colorScheme.buttonBackground,
                contentColor = AppCustomTheme.colorScheme.buttonTextColor
            ),
        ) {
            Text(
                text = "Button",
                style = AppCustomTheme.typography.buttonTextStyle
            )
        }
        Spacer(modifier = Modifier.width(5.dp))
        Button(
            modifier = Modifier.width(AppCustomTheme.size.bigButtonSize),
            onClick = {},
            shape = AppCustomTheme.shape.circleShapeButton,
            colors = ButtonDefaults.buttonColors(
                containerColor = AppCustomTheme.colorScheme.buttonBackground,
                contentColor = AppCustomTheme.colorScheme.buttonTextColor
            ),
        ) {
            Text(
                text = "Button",
                style = AppCustomTheme.typography.buttonTextStyle
            )
        }
    }
}