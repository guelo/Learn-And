package com.ggaali.analytics.impl

import com.ggaali.analytics.IAnalyticsLog

class DefaultAnalyticsLog : IAnalyticsLog {
    override fun log(eventName: String, eventTag: Map<String, String>) {
        println("[ $eventName : ${eventTag.toList()}")
    }
}