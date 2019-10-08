package com.gaali.core.appinterfaces

interface IAppPlayer {

    fun load(url: String)
    fun play()
    fun pause()
    fun stop()
    fun seekForward15()
    fun seekBackward15()
}