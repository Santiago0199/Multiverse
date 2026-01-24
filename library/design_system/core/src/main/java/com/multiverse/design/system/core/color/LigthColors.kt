package com.multiverse.design.system.core.color

import androidx.compose.ui.graphics.Color

class MultiverseLightColors(
    primary: PrimaryPalette = PrimaryPalette(
        main = Color(0xFF6750A4),
        onMain = Color(0xFFFFFFFF),
        container = Color(0xFFEADDFF),
        onContainer = Color(0xFF21005D),
        fixed = Color(0xFF6750A4),
        fixedDim = Color(0xFF4F378B),
        onFixed = Color(0xFFFFFFFF),
        onFixedVariant = Color(0xFFEADDFF),
    ),
    secondary: SecondaryPalette = SecondaryPalette(
        main = Color(0xFF625B71),
        onMain = Color(0xFFFFFFFF),
        container = Color(0xFFE8DEF8),
        onContainer = Color(0xFF1D192B),
        fixed = Color(0xFF625B71),
        fixedDim = Color(0xFF4A4458),
        onFixed = Color(0xFFFFFFFF),
        onFixedVariant = Color(0xFFE8DEF8),
    ),
    tertiary: TertiaryPalette = TertiaryPalette(
        main = Color(0xFF7D5260),
        onMain = Color(0xFFFFFFFF),
        container = Color(0xFFFFD8E4),
        onContainer = Color(0xFF31111D),
        fixed = Color(0xFF7D5260),
        fixedDim = Color(0xFF633B48),
        onFixed = Color(0xFFFFFFFF),
        onFixedVariant = Color(0xFFFFD8E4),
    ),
    neutral: NeutralPalette = NeutralPalette(
        background = Color(0xFFFFFBFE),
        onBackground = Color(0xFF1C1B1F),
        surface = Color(0xFFFFFBFE),
        onSurface = Color(0xFF1C1B1F),
        surfaceVariant = Color(0xFFE7E0EC),
        onSurfaceVariant = Color(0xFF49454F),
        surfaceBright = Color(0xFFFDF8FD),
        surfaceDim = Color(0xFFDED8E1),
        surfaceContainer = Color(0xFFF3EDF7),
        surfaceContainerHigh = Color(0xFFE9E3F0),
        surfaceContainerHighest = Color(0xFFE6E0EC),
        surfaceContainerLow = Color(0xFFF7F2FA),
        surfaceContainerLowest = Color(0xFFFFFFFF),
        inverseSurface = Color(0xFF313033),
        inverseOnSurface = Color(0xFFF4EFF4),
        outline = Color(0xFF79747E),
        outlineVariant = Color(0xFFCAC4D0),
        scrim = Color(0xFF000000),
        surfaceTint = Color(0xFF6750A4),
    ),
    error: ErrorPalette = ErrorPalette(
        main = Color(0xFFB3261E),
        onMain = Color(0xFFFFFFFF),
        container = Color(0xFFF9DEDC),
        onContainer = Color(0xFF410E0B),
    )
): MultiverseColors(
    primary = primary,
    secondary = secondary,
    tertiary = tertiary,
    neutral = neutral,
    error = error,
)
