package com.gaali.core.analytics.mapper

import com.gaali.core.log.IAppLog
import com.ggaali.analytics.IAnalyticsLog

class AnalyticsLogMapper(private val appLog: IAppLog) : IAnalyticsLog {

    companion object {
        private val TAG = AnalyticsLogMapper::class.simpleName
    }


    override fun log(eventName: String, eventTag: Map<String, String>) {
        appLog.log(
            IAppLog.Level.INFO,
            TAG,
            listOf(IAppLog.Filter.ANA),
            eventTag.toList().toString()
        )
    }
}