package com.multiverse.core.view.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.multiverse.core.view.navigation.route.Route

/**
 * Convenience overload for `NavGraphBuilder.composable` that accepts a [com.multiverse.core.view.navigation.route.Route].
 *
 * It wires:
 * - the destination [com.multiverse.core.view.navigation.route.Route.route]
 * - the mapped arguments from [com.multiverse.core.view.navigation.route.Route.getArguments]
 * - the deep links from [com.multiverse.core.view.navigation.route.Route.getDeepLinks]
 *
 * @param route The [com.multiverse.core.view.navigation.route.Route] describing this destination.
 * @param content Destination content lambda receiving the [NavBackStackEntry].
 */
fun NavGraphBuilder.composable(
    route: Route,
    content: @Composable AnimatedContentScope.(NavBackStackEntry) -> Unit
) {
    composable(
        route = route.route,
        arguments = route.getNavArguments(),
        deepLinks = route.getNavDeepLinks(),
    ) { backStackEntry ->
        content(backStackEntry)
    }
}
