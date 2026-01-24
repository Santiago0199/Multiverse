package com.multiverse.core.view.navigation.route

import android.net.Uri
import androidx.navigation.NavType

/**
 * Describes a single navigation argument.
 *
 * @property name Argument name as referenced in the route pattern (e.g., "{id}" -> "id").
 * @property type Argument type represented as [ArgType] (mapped to [NavType] internally).
 * @property nullable Whether this argument can be null (useful for query params).
 * @property defaultValue Optional default value. Must match the underlying type expected by Navigation.
 */
data class Argument(
    val name: String,
    val type: ArgType,
    val nullable: Boolean = false,
    val defaultValue: Any? = null
)

/**
 * Custom argument types used by this navigation layer.
 *
 * This sealed hierarchy avoids leaking [NavType] to consumers. Internally, each [ArgType] is
 * mapped to a corresponding [NavType] in [Route.ArgType.toNavType].
 *
 * Notes:
 * - For complex objects, prefer passing an identifier (e.g., `movieId`) and loading data from a repo.
 * - If you must pass an object, use [JsonString] and encode it via [encodeArg] to keep the route safe.
 */
sealed class ArgType {

    /** A single String argument (`NavType.StringType`). */
    data object String : ArgType()

    /** A single Int argument (`NavType.IntType`). */
    data object Int : ArgType()

    /** A single Boolean argument (`NavType.BoolType`). */
    data object Bool : ArgType()

    /** A list of Strings argument (`NavType.StringListType`). */
    data object StringList : ArgType()

    /**
     * A String intended to carry serialized objects (e.g., JSON).
     *
     * It is mapped to `NavType.StringType`. Values should be Uri-encoded with [encodeArg]
     * when building the route, and decoded with [decodeArg] on the destination side.
     */
    data object JsonString : ArgType()
}

/**
 * Encodes a string argument so it can be safely placed into a navigation route.
 *
 * This is specially useful for [Route.ArgType.JsonString] where the value may contain
 * characters not allowed in a route segment (spaces, slashes, braces, etc.).
 *
 * @param value Raw value to encode.
 * @return Uri-encoded value safe to put into a route.
 */
fun encodeArg(value: String): String = Uri.encode(value)

/**
 * Decodes a previously encoded route argument.
 *
 * @param value Encoded value obtained from the route/back stack arguments.
 * @return Decoded raw value.
 */
fun decodeArg(value: String): String = Uri.decode(value)