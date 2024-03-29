package com.example.jetpackcomposesample

import androidx.compose.unaryPlus
import androidx.ui.core.sp
import androidx.ui.engine.geometry.Shape
import androidx.ui.graphics.Color
import androidx.ui.material.ButtonStyle
import androidx.ui.material.themeColor
import androidx.ui.material.themeShape
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily

fun MainListButtonStyle(
    shape: Shape = +themeShape { button },
    contentColor: Color? = +themeColor { primary }
) = ButtonStyle(
    color = Color.Transparent,
    shape = shape,
    textStyle = TextStyle(color = contentColor, fontSize = 20.sp),
    rippleColor = contentColor
)

fun originalAppBarTextStyle() = TextStyle(color = Color.White)
fun originalTextViewStyle() = TextStyle(color = Color.Red, fontSize = 30.sp, fontFamily = FontFamily.Cursive)