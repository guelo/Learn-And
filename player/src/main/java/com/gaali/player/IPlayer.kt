package com.gaali.player

interface IPlayer {
    fun load(url: String)
    fun play()
    fun stop()
    fun pause()
    fun seek(position: Int)
}