package com.example.logging

import android.util.Log
import javax.inject.Inject

internal class AndroidLog @Inject constructor() : ILogger {
    override fun log(logType: ILogger.Type, message: String) {
        when (logType) {
            ILogger.Type.DEBUG -> Log.d("tag", message)
            ILogger.Type.WARN -> Log.w("tag", message)
            ILogger.Type.VERBOSE -> Log.v("tag", message)
            ILogger.Type.ERROR -> Log.e("tag", message)
        }
    }

}