package com.gaali.core.appinterfaces.mappers

import com.gaali.core.appinterfaces.IAppLog
import com.ggaali.analytics.IAnalyticsLog
import javax.inject.Inject

internal class IAppLogToIAnalyticsLog @Inject constructor(private val appLog: IAppLog) : IAnalyticsLog {

    companion object {
        private val TAG = IAppLogToIAnalyticsLog::class.toString()
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