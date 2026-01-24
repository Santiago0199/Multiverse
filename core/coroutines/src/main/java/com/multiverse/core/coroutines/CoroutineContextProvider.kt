package com.multiverse.core.coroutines

import kotlin.coroutines.CoroutineContext

interface CoroutineContextProvider {
    val io: CoroutineContext
    val main: CoroutineContext
    val default: CoroutineContext
}
