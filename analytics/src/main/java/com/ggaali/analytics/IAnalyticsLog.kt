package com.ggaali.analytics

interface IAnalyticsLog {
    fun log(eventName: String, eventTag: Map<String, String>)
}