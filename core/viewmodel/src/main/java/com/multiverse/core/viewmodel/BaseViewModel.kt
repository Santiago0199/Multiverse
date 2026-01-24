package com.multiverse.core.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.multiverse.core.coroutines.CoroutineContextProvider
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

open class BaseViewModel<ViewState, ViewEvent> constructor(
    private val initialViewState: ViewState,
    protected val coroutineContextProvider: CoroutineContextProvider
): ViewModel(), CoroutineContextProvider by coroutineContextProvider {

    protected val mutableViewEvent = MutableSharedFlow<ViewEvent>()
    private val mutableViewState: MutableSharedFlow<ViewState> = MutableSharedFlow(
        replay = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST
    )

    val viewState: Flow<ViewState> get() = mutableViewState
    val viewEvent: Flow<ViewEvent> get() = mutableViewEvent

    fun launch(
        coroutineContext: CoroutineContext = main,
        codeBlock: suspend() -> Unit
    ) {
        viewModelScope.launch(coroutineContext) {
            codeBlock()
        }
    }

    protected suspend fun updateViewState(getNewViewState: suspend(ViewState) -> ViewState) {
        mutableViewState.emit(getNewViewState(currentViewState()))
    }

    protected fun currentViewState(): ViewState {
        return mutableViewState.replayCache.firstOrNull() ?: initialViewState
    }
}
