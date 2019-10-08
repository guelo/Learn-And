package com.gaali.core.appinterfaces

interface IAppAnalytics {
    fun logEvent(eventName: String, eventMap: MutableMap<String, String>)
}