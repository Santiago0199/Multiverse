package com.multiverse.movie.impl.ui.home.navigation

import com.multiverse.core.view.navigation.route.Route

object MovieRoute: Route(
    route = "movies/home",
    deepLinks = listOf("movies/home"),
    arguments = listOf()
)