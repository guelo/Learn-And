package com.gaali.core.appinterfaces.mappers

import com.gaali.core.appinterfaces.IAppAnalytics
import com.ggaali.analytics.IAnalytics
import javax.inject.Inject

internal class IAnalyticsToIAppAnalytics @Inject constructor(private var analytics: IAnalytics) :
    IAppAnalytics {
    override fun logEvent(eventName: String, eventMap: MutableMap<String, String>) {
        analytics.logEvent(eventName, eventMap);
    }
}