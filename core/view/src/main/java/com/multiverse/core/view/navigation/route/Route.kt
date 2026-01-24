package com.multiverse.core.view.navigation.route

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink
import com.multiverse.core.view.navigation.route.mapper.toDeepLinks
import com.multiverse.core.view.navigation.route.mapper.toNavArgument

/**
 * Represents a navigation destination for Navigation Compose with:
 * - a [route] used by the `NavHost`
 * - a [uriPattern] used for deep links
 * - a list of typed [arguments] defined using [ArgType] (a custom abstraction over [androidx.navigation.NavType])
 *
 * This model keeps `NavType` out of feature modules by exposing [ArgType] instead, and internally
 * maps it to [androidx.navigation.NamedNavArgument] via [getArguments].
 *
 * Example:
 * ```
 * val detail = ComposableRoute(
 *   route = "detail/{id}",
 *   uriPattern = "detail/{id}",
 *   arguments = listOf(ComposableRoute.Argument("id", ComposableRoute.ArgType.String))
 * )
 * ```
 *
 * @property route Navigation Compose route string (e.g., "detail/{id}").
 * @property uriPattern Deep link pattern without the base scheme/host (e.g., "detail/{id}").
 * @property arguments List of arguments for this route in a custom typed form.
 */
abstract class Route(
    val route: String,
    val deepLinks: List<String>,
    val arguments: List<Argument> = emptyList()
) {

    /**
     * Builds the deep links for this route using the configured base URI and [uriPattern].
     *
     * @return A list containing a single [androidx.navigation.NavDeepLink] for the full URI pattern.
     */
    fun getNavDeepLinks(): List<NavDeepLink> = deepLinks.map {
        it.toDeepLinks()
    }

    /**
     * Maps [arguments] from the custom [Argument]/[ArgType] model to Navigation Compose arguments.
     *
     * @return A list of [androidx.navigation.NamedNavArgument] ready to be passed to `NavGraphBuilder.composable(...)`.
     */
    fun getNavArguments(): List<NamedNavArgument> = arguments.map {
        it.toNavArgument()
    }
}