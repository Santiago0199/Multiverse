package com.multiverse.design.system.core.dimension

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes

fun Radius.toMaterialShapes() = Shapes(
    extraSmall = RoundedCornerShape(extraSmall),
    small = RoundedCornerShape(small),
    medium = RoundedCornerShape(medium),
    large = RoundedCornerShape(large),
    extraLarge = RoundedCornerShape(extraLarge),
)
