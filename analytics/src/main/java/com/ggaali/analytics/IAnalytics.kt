package com.ggaali.analytics

interface IAnalytics {
    fun logEvent(eventName: String, eventMap: MutableMap<String, String>)
}