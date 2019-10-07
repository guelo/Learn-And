package com.gaali.core.player

interface IAppPlayer {

    fun load(url: String)
    fun play()
    fun pause()
    fun stop()
    fun seekForward15()
    fun seekBackward15()
}