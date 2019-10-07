package com.gaali.core.player.mapper

import com.gaali.core.log.IAppLog
import com.gaali.core.log.IAppLog.Filter
import com.gaali.player.IPlayerLog

class PlayerLogMapper(val iAppLog: IAppLog) : IPlayerLog {
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