package com.gaali.core.log.impl

import android.util.Log
import com.gaali.core.log.IAppLog
import com.gaali.core.log.IAppLog.Filter

internal class AndroidLog : IAppLog {
    override fun log(
        level: IAppLog.Level,
        tag: String?,
        filter: List<Filter>,
        message: String,
        throwable: Throwable?
    ) {
        val filterStr = filter.joinToString(prefix = "[", postfix = "]")
        when (level) {
            IAppLog.Level.DEBUG -> Log.d(tag, filterStr + message, throwable)
            IAppLog.Level.INFO -> Log.i(tag, filterStr + message)
            IAppLog.Level.WARN -> Log.w(tag, filterStr + message)
            IAppLog.Level.ERROR -> Log.e(tag, filterStr + message, throwable)
        }
    }
}