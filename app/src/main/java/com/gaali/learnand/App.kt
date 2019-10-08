package com.gaali.learnand

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        AppComponent.init(this)
    }
}
