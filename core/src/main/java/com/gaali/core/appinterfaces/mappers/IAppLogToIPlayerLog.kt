package com.gaali.core.appinterfaces.mappers

import com.gaali.core.appinterfaces.IAppLog
import com.gaali.core.appinterfaces.IAppLog.Filter
import com.gaali.player.IPlayerLog

internal class IAppLogToIPlayerLog(val iAppLog: IAppLog) : IPlayerLog {
    override fun d(tag: String?, message: String, throwable: Throwable?) {
        iAppLog.log(
            IAppLog.Level.DEBUG,
            tag,
            listOf(Filter.SXMP, Filter.NPL),
            message
        )
    }

    override fun e(tag: String?, message: String, throwable: Throwable?) {
        iAppLog.log(
            IAppLog.Level.ERROR,
            tag,
            listOf(Filter.SXMP, Filter.NPL),
            message,
            throwable
        )
    }

    override fun i(tag: String?, message: String) {
        iAppLog.log(
            IAppLog.Level.INFO,
            tag,
            listOf(Filter.SXMP, Filter.NPL),
            message
        )
    }

    override fun w(tag: String?, message: String) {
        iAppLog.log(
            IAppLog.Level.WARN,
            tag,
            listOf(Filter.SXMP, Filter.NPL),
            message
        )
    }

}