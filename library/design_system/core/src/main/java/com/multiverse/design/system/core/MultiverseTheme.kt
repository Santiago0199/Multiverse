package com.multiverse.design.system.core

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext
import com.multiverse.design.system.core.color.MultiverseColors
import com.multiverse.design.system.core.color.MultiverseDarkColors
import com.multiverse.design.system.core.color.MultiverseLightColors
import com.multiverse.design.system.core.color.toMaterialColorScheme
import com.multiverse.design.system.core.dimension.MultiverseDimensions
import com.multiverse.design.system.core.dimension.DefaultDimensions
import com.multiverse.design.system.core.dimension.toMaterialShapes
import com.multiverse.design.system.core.typography.DefaultTypography
import com.multiverse.design.system.core.typography.MultiverseTypography
import com.multiverse.design.system.core.typography.toMaterialTypography

private val DarkColors = MultiverseDarkColors()
private val LightColors = MultiverseLightColors()
private val LocalMultiverseColors = staticCompositionLocalOf<MultiverseColors> {
    error("Multiverse Theme Color must be provided")
}
private val LocalMultiverseTypography = staticCompositionLocalOf<MultiverseTypography> {
    error("Multiverse Theme Typography must be provided")
}
private val LocalMultiverseDimensions = staticCompositionLocalOf<MultiverseDimensions> {
    error("Multiverse Theme Dimensions must be provided")
}

@Composable
fun MultiverseTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    val multiverseColors: MultiverseColors = if (darkTheme) DarkColors else LightColors
    val isDynamicColorSupported = dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

    val colorScheme = when {
        isDynamicColorSupported && darkTheme -> dynamicDarkColorScheme(context)
        isDynamicColorSupported && !darkTheme -> dynamicLightColorScheme(context)
        else -> multiverseColors.toMaterialColorScheme()
    }

    val typography = DefaultTypography()
    val dimensions = DefaultDimensions()

    CompositionLocalProvider(
        LocalMultiverseColors provides multiverseColors,
        LocalMultiverseTypography provides typography,
        LocalMultiverseDimensions provides dimensions
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = typography.toMaterialTypography(),
            shapes = dimensions.radius.toMaterialShapes(),
            content = content
        )
    }
}

object MultiverseTheme {
    val colors: MultiverseColors
        @Composable
        get() = LocalMultiverseColors.current
    val typography: MultiverseTypography
        @Composable
        get() = LocalMultiverseTypography.current
    val dimensions: MultiverseDimensions
        @Composable
        get() = LocalMultiverseDimensions.current
}
