package com.multiverse.design.system.core.color

import androidx.compose.ui.graphics.Color

class MultiverseDarkColors(
    primary: PrimaryPalette = PrimaryPalette(
        main = Color(0xFFD0BCFF),
        onMain = Color(0xFF381E72),
        container = Color(0xFF4F378B),
        onContainer = Color(0xFFEADDFF),
        fixed = Color(0xFFD0BCFF),
        fixedDim = Color(0xFFB69DF8),
        onFixed = Color(0xFF381E72),
        onFixedVariant = Color(0xFF4F378B),
    ),
    secondary: SecondaryPalette = SecondaryPalette(
        main = Color(0xFFCCC2DC),
        onMain = Color(0xFF332D41),
        container = Color(0xFF4A4458),
        onContainer = Color(0xFFE8DEF8),
        fixed = Color(0xFFCCC2DC),
        fixedDim = Color(0xFFB1A7C9),
        onFixed = Color(0xFF332D41),
        onFixedVariant = Color(0xFF4A4458),
    ),
    tertiary: TertiaryPalette = TertiaryPalette(
        main = Color(0xFFEFB8C8),
        onMain = Color(0xFF492532),
        container = Color(0xFF633B48),
        onContainer = Color(0xFFFFD8E4),
        fixed = Color(0xFFEFB8C8),
        fixedDim = Color(0xFFD29EAE),
        onFixed = Color(0xFF492532),
        onFixedVariant = Color(0xFF633B48),
    ),
    neutral: NeutralPalette = NeutralPalette(
        background = Color(0xFF1C1B1F),
        onBackground = Color(0xFFE6E1E5),
        surface = Color(0xFF1C1B1F),
        onSurface = Color(0xFFE6E1E5),
        surfaceVariant = Color(0xFF49454F),
        onSurfaceVariant = Color(0xFFCAC4D0),
        surfaceBright = Color(0xFF38353A),
        surfaceDim = Color(0xFF141218),
        surfaceContainer = Color(0xFF211F26),
        surfaceContainerHigh = Color(0xFF2B2930),
        surfaceContainerHighest = Color(0xFF36343B),
        surfaceContainerLow = Color(0xFF1D1B21),
        surfaceContainerLowest = Color(0xFF0F0D13),
        inverseSurface = Color(0xFFE6E1E5),
        inverseOnSurface = Color(0xFF313033),
        outline = Color(0xFF938F99),
        outlineVariant = Color(0xFF49454F),
        scrim = Color(0xFF000000),
        surfaceTint = Color(0xFFD0BCFF),
    ),
    error: ErrorPalette = ErrorPalette(
        main = Color(0xFFF2B8B5),
        onMain = Color(0xFF601410),
        container = Color(0xFF8C1D18),
        onContainer = Color(0xFFF9DEDC),
    )
): MultiverseColors(
    primary = primary,
    secondary = secondary,
    tertiary = tertiary,
    neutral = neutral,
    error = error,
)
