package com.multiverse.design.system.core.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class DefaultTypography(
    display: DisplayTypography = DisplayTypography(
        large = TextStyle(
            fontSize = 57.sp,
            lineHeight = 64.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = (-0.25).sp,
        ),
        medium = TextStyle(
            fontSize = 45.sp,
            lineHeight = 52.sp,
            fontWeight = FontWeight.Normal,
        ),
        small = TextStyle(
            fontSize = 36.sp,
            lineHeight = 44.sp,
            fontWeight = FontWeight.Normal,
        ),
    ),
    headline: HeadlineTypography = HeadlineTypography(
        large = TextStyle(
            fontSize = 32.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight.Normal,
        ),
        medium = TextStyle(
            fontSize = 28.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.Normal,
        ),
        small = TextStyle(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Normal,
        ),
    ),
    title: TitleTypography = TitleTypography(
        large = TextStyle(
            fontSize = 22.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Medium,
        ),
        medium = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Medium,
        ),
        small = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Medium,
        ),
    ),
    body: BodyTypography = BodyTypography(
        large = TextStyle(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
        ),
        medium = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Normal,
        ),
        small = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
        ),
    ),
    label: LabelTypography = LabelTypography(
        large = TextStyle(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Medium,
        ),
        medium = TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Medium,
        ),
        small = TextStyle(
            fontSize = 11.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Medium,
        ),
    ),
) : MultiverseTypography(
    display = display,
    headline = headline,
    title = title,
    body = body,
    label = label
)
