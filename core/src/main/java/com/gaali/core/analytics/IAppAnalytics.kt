package com.gaali.core.analytics

interface IAppAnalytics {
    fun logEvent(eventName: String, eventMap: MutableMap<String, String>)
}