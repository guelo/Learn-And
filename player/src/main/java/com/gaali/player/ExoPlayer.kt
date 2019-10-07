package com.gaali.player

class ExoPlayer(private val log: IPlayerLog) : IPlayer {

    companion object {
        private val TAG = this::class.simpleName
    }

    override fun play() {
        log.i(TAG, "Play")
    }

    override fun stop() {
        log.i(TAG, "Stop")
    }

    override fun pause() {
        log.i(TAG, "pause")
    }

    override fun seek(position: Int) {
        log.i(TAG, "seek to: $position")
    }

    override fun load(url: String) {
        log.d(TAG, "load: $url")
    }
}