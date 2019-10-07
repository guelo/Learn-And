package com.gaali.core.log.impl

import com.gaali.core.log.IAppLog

internal class PandoraLog : IAppLog {

    override fun log(
        level: IAppLog.Level,
        tag: String?,
        filter: List<IAppLog.Filter>,
        message: String,
        throwable: Throwable?
    ) {
        println("Level: $level ,Message: $message")
    }
}