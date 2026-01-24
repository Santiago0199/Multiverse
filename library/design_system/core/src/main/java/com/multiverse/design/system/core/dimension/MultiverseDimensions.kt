package com.multiverse.design.system.core.dimension

import androidx.compose.ui.unit.Dp

open class MultiverseDimensions(
    val spacing: Spacing,
    val radius: Radius,
    val elevation: Elevation,
    val icons: Icon
)

data class Spacing(
    val xs: Dp,
    val sm: Dp,
    val md: Dp,
    val lg: Dp,
    val xl: Dp,
    val xxl: Dp,
)

data class Radius(
    val none: Dp,
    val extraSmall: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
    val extraLarge: Dp,
    val full: Dp,
)

data class Elevation(
    val level0: Dp,
    val level1: Dp,
    val level2: Dp,
    val level3: Dp,
    val level4: Dp,
    val level5: Dp,
)

data class Icon(
    val xSmall: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
    val xLarge: Dp,
)
