package com.gaali.core.log

interface IAppLog {

    enum class Level {
        DEBUG,
        ERROR,
        WARN,
        INFO
    }

    enum class Filter {
        SXMP,
        NPL,
        ANA
    }

    fun log(
        level: Level,
        tag: String?,
        filter: List<Filter>,
        message: String,
        throwable: Throwable? = null
    )
}