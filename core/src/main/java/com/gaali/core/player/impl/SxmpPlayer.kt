package com.gaali.core.player.impl

import com.gaali.core.player.IAppPlayer
import com.gaali.player.IPlayer

class SxmpPlayer(private val player: IPlayer) : IAppPlayer {
    override fun load(url: String) {
        player.load(url)
    }

    override fun play() {
        player.play()
    }

    override fun pause() {
        player.pause()
    }

    override fun stop() {
        player.stop()
    }

    override fun seekForward15() {
        player.seek(15)
    }

    override fun seekBackward15() {
        player.seek(-15)
    }
}