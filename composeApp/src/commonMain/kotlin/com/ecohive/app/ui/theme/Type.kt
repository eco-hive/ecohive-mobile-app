package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import ecohive.composeapp.generated.resources.Lexend_Bold
import ecohive.composeapp.generated.resources.Lexend_Light
import ecohive.composeapp.generated.resources.Lexend_Medium
import ecohive.composeapp.generated.resources.Lexend_Regular
import ecohive.composeapp.generated.resources.Lexend_SemiBold
import ecohive.composeapp.generated.resources.Res
import ecohive.composeapp.generated.resources.Roboto_Bold
import ecohive.composeapp.generated.resources.Roboto_Light
import ecohive.composeapp.generated.resources.Roboto_Medium
import ecohive.composeapp.generated.resources.Roboto_Regular
import ecohive.composeapp.generated.resources.Roboto_SemiBold
import org.jetbrains.compose.resources.Font

@Composable
fun RobotoFontFamily() = FontFamily(
    Font(Res.font.Roboto_Light, weight = FontWeight.Light),
    Font(Res.font.Roboto_Regular, weight = FontWeight.Normal),
    Font(Res.font.Roboto_Medium, weight = FontWeight.Medium),
    Font(Res.font.Roboto_SemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.Roboto_Bold, weight = FontWeight.Bold)
)

@Composable
fun LexendFontFamily() = FontFamily(
    Font(Res.font.Lexend_Light, weight = FontWeight.Light),
    Font(Res.font.Lexend_Regular, weight = FontWeight.Normal),
    Font(Res.font.Lexend_Medium, weight = FontWeight.Medium),
    Font(Res.font.Lexend_SemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.Lexend_Bold, weight = FontWeight.Bold)
)

@Composable
fun AppTypography() = Typography().run {

    val robotoFontFamily = RobotoFontFamily()
    val lexendFontFamily = LexendFontFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = lexendFontFamily),
        displayMedium = displayMedium.copy(fontFamily = lexendFontFamily),
        displaySmall = displaySmall.copy(fontFamily = lexendFontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = lexendFontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = lexendFontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = lexendFontFamily),
        titleLarge = titleLarge.copy(fontFamily = lexendFontFamily),
        titleMedium = titleMedium.copy(fontFamily = lexendFontFamily),
        titleSmall = titleSmall.copy(fontFamily = lexendFontFamily),
        bodyLarge = bodyLarge.copy(fontFamily =  robotoFontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = robotoFontFamily),
        bodySmall = bodySmall.copy(fontFamily = robotoFontFamily),
        labelLarge = labelLarge.copy(fontFamily = robotoFontFamily),
        labelMedium = labelMedium.copy(fontFamily = robotoFontFamily),
        labelSmall = labelSmall.copy(fontFamily = robotoFontFamily)
    )
}