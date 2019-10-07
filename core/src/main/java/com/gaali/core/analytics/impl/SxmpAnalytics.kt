package com.gaali.core.analytics.impl

import com.gaali.core.analytics.IAppAnalytics
import com.ggaali.analytics.IAnalytics

class SxmpAnalytics(private var analytics: IAnalytics) : IAppAnalytics {
    override fun logEvent(eventName: String, eventMap: MutableMap<String, String>) {
        analytics.logEvent(eventName, eventMap);
    }
}