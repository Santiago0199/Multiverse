package com.multiverse.core.view.navigation.route.mapper

import androidx.navigation.NavDeepLink
import androidx.navigation.navDeepLink

/**
 * Builds the deep links for this route using the configured base URI and [uriPattern].
 *
 * @return A list containing a single [NavDeepLink] for the full URI pattern.
 */
internal fun String.toDeepLinks(): NavDeepLink {
    val deepLinkUri = "https://multiverse/$this"
    return navDeepLink {
        uriPattern = deepLinkUri
    }
}

