package com.multiverse.movie.impl.ui.detail.navigation

import com.multiverse.core.view.navigation.route.Route

object MovieDetailRoute: Route(
    route = "movies/detail",
    deepLinks = listOf("movies/detail"),
    arguments = listOf()
)