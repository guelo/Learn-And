package com.ggaali.analytics.impl

import com.ggaali.analytics.IAnalytics
import com.ggaali.analytics.IAnalyticsLog
import com.ggaali.analytics.impl.DefaultAnalyticsLog

class FirebaseAnalytics(private val logger: IAnalyticsLog? = DefaultAnalyticsLog()) : IAnalytics {
    override fun logEvent(eventName: String, eventMap: MutableMap<String, String>) {
        logger?.log(eventName, eventMap)
    }
}