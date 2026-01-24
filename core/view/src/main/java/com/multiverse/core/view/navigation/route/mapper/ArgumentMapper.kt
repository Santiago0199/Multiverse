package com.multiverse.core.view.navigation.route.mapper

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.multiverse.core.view.navigation.route.Route
import com.multiverse.core.view.navigation.route.ArgType
import com.multiverse.core.view.navigation.route.Argument

/**
 * Maps [arguments] from the custom [Argument]/[ArgType] model to Navigation Compose arguments.
 *
 * @return A list of [NamedNavArgument] ready to be passed to `NavGraphBuilder.composable(...)`.
 */
internal fun Argument.toNavArgument(): NamedNavArgument =
    navArgument(name) {
        nullable = nullable
        defaultValue = defaultValue
        type = this@toNavArgument.type.toNavType()
    }

/**
 * Central mapper from the custom [Route.ArgType] to Navigation's [NavType].
 *
 * This keeps `NavType` out of the public API of [Route].
 *
 * @receiver The custom argument type.
 * @return The corresponding [NavType] used by Navigation Compose.
 */
internal fun ArgType.toNavType(): NavType<*> = when (this) {
    ArgType.String -> NavType.StringType
    ArgType.Int -> NavType.IntType
    ArgType.Bool -> NavType.BoolType
    ArgType.StringList -> NavType.StringListType
    ArgType.JsonString -> NavType.StringType
}