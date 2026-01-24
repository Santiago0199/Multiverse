package com.multiverse.design.system.core.color

import androidx.compose.ui.graphics.Color

open class MultiverseColors(
    val primary: PrimaryPalette,
    val secondary: SecondaryPalette,
    val tertiary: TertiaryPalette,
    val neutral: NeutralPalette,
    val error: ErrorPalette,
)

data class PrimaryPalette(
    val main: Color,
    val onMain: Color,
    val container: Color,
    val onContainer: Color,
    val fixed: Color,
    val fixedDim: Color,
    val onFixed: Color,
    val onFixedVariant: Color,
)

data class SecondaryPalette(
    val main: Color,
    val onMain: Color,
    val container: Color,
    val onContainer: Color,
    val fixed: Color,
    val fixedDim: Color,
    val onFixed: Color,
    val onFixedVariant: Color,
)

data class TertiaryPalette(
    val main: Color,
    val onMain: Color,
    val container: Color,
    val onContainer: Color,
    val fixed: Color,
    val fixedDim: Color,
    val onFixed: Color,
    val onFixedVariant: Color,
)

data class NeutralPalette(
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val surfaceVariant: Color,
    val onSurfaceVariant: Color,
    val surfaceBright: Color,
    val surfaceDim: Color,
    val surfaceContainer: Color,
    val surfaceContainerHigh: Color,
    val surfaceContainerHighest: Color,
    val surfaceContainerLow: Color,
    val surfaceContainerLowest: Color,
    val inverseSurface: Color,
    val inverseOnSurface: Color,
    val outline: Color,
    val outlineVariant: Color,
    val scrim: Color,
    val surfaceTint: Color,
)

data class ErrorPalette(
    val main: Color,
    val onMain: Color,
    val container: Color,
    val onContainer: Color,
)