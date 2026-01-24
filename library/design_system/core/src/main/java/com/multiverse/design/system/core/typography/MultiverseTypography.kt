package com.multiverse.design.system.core.typography

import androidx.compose.ui.text.TextStyle

open class MultiverseTypography(
    val display: DisplayTypography,
    val headline: HeadlineTypography,
    val title: TitleTypography,
    val body: BodyTypography,
    val label: LabelTypography,
)

data class DisplayTypography(
    val large: TextStyle,
    val medium: TextStyle,
    val small: TextStyle,
)

data class HeadlineTypography(
    val large: TextStyle,
    val medium: TextStyle,
    val small: TextStyle,
)

data class TitleTypography(
    val large: TextStyle,
    val medium: TextStyle,
    val small: TextStyle,
)

data class BodyTypography(
    val large: TextStyle,
    val medium: TextStyle,
    val small: TextStyle,
)

data class LabelTypography(
    val large: TextStyle,
    val medium: TextStyle,
    val small: TextStyle,
)