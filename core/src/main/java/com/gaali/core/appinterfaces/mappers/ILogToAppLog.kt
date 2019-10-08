package com.gaali.core.appinterfaces.mappers

import com.example.logging.ILogger
import com.gaali.core.appinterfaces.IAppLog
import javax.inject.Inject

internal class ILogToAppLog @Inject constructor(private val iLogger: ILogger) :
    IAppLog {

    override fun log(
        level: IAppLog.Level,
        tag: String?,
        filter: List<IAppLog.Filter>,
        message: String,
        throwable: Throwable?
    ) {
        val iLoggerLevel = when (level) {
            IAppLog.Level.DEBUG -> ILogger.Type.DEBUG
            IAppLog.Level.ERROR -> ILogger.Type.ERROR
            IAppLog.Level.WARN -> ILogger.Type.WARN
            IAppLog.Level.INFO -> ILogger.Type.VERBOSE
        }
        iLogger.log(iLoggerLevel, message)
    }

}