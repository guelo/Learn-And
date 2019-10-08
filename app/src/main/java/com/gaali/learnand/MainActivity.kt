package com.gaali.learnand

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaali.core.appinterfaces.IAppAnalytics
import com.gaali.core.appinterfaces.IAppLog
import com.gaali.core.appinterfaces.IAppPlayer
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    init {
        Injector.inject(this)
    }

    @Inject lateinit var log: IAppLog
    @Inject lateinit var analytics: IAppAnalytics
    @Inject lateinit var player: IAppPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        log.log(IAppLog.Level.DEBUG, "tag", emptyList(), "message" )
        analytics.logEvent("name", mutableMapOf())
        player.play()
    }
}
