package com.multiverse.design.system.core.typography

import androidx.compose.material3.Typography

internal fun MultiverseTypography.toMaterialTypography() = Typography(
    displayLarge = display.large,
    displayMedium = display.medium,
    displaySmall = display.small,
    headlineLarge = headline.large,
    headlineMedium = headline.medium,
    headlineSmall = headline.small,
    titleLarge = title.large,
    titleMedium = title.medium,
    titleSmall = title.small,
    bodyLarge = body.large,
    bodyMedium = body.medium,
    bodySmall = body.small,
    labelLarge = label.large,
    labelMedium = label.medium,
    labelSmall = label.small,
)
