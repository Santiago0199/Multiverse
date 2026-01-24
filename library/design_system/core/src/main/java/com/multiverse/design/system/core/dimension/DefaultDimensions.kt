package com.multiverse.design.system.core.dimension

import androidx.compose.ui.unit.dp

class DefaultDimensions(
    spacing: Spacing = Spacing(
        xs = 4.dp,
        sm = 8.dp,
        md = 12.dp,
        lg = 16.dp,
        xl = 24.dp,
        xxl = 32.dp,
    ),
    radius: Radius = Radius(
        none = 0.dp,
        extraSmall = 4.dp,
        small = 8.dp,
        medium = 12.dp,
        large = 16.dp,
        extraLarge = 28.dp,
        full = 1000.dp,
    ),
    elevation: Elevation = Elevation(
        level0 = 0.dp,
        level1 = 1.dp,
        level2 = 3.dp,
        level3 = 6.dp,
        level4 = 8.dp,
        level5 = 12.dp,
    ),
    icons: Icon = Icon(
        xSmall = 16.dp,
        small = 20.dp,
        medium = 24.dp,
        large = 32.dp,
        xLarge = 40.dp,
    ),
): MultiverseDimensions(
    icons = icons,
    spacing = spacing,
    radius = radius,
    elevation = elevation
)
