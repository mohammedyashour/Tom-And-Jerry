package com.mohammed.tom_and_jerry.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mohammed.tom_and_jerry.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)
val IBMPlexArabic = FontFamily(
    Font(R.font.ibmplexsansarabic_bold, FontWeight.Bold),
    Font(R.font.ibmplexsansarabic_medium, FontWeight.Medium),
    Font(R.font.ibmplexsansarabic_thin, FontWeight.Thin),
    Font(R.font.ibmplexsansarabic_light, FontWeight.Light),
    Font(R.font.ibmplexsansarabic_semibold, FontWeight.SemiBold),
    Font(R.font.ibmplexsansarabic_extralight, FontWeight.ExtraLight),
    Font(R.font.ibmplexsansarabic_regular, FontWeight.Normal)
)

val AppTypography = Typography(
    titleMedium = TextStyle(
        fontFamily = IBMPlexArabic,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    bodySmall = TextStyle(
        fontFamily = IBMPlexArabic,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    )
)