package com.ggaali.analytics.impl

import com.ggaali.analytics.IAnalytics
import com.ggaali.analytics.IAnalyticsLog
import javax.inject.Inject

internal class FirebaseAnalytics @Inject constructor(
    private val logger: IAnalyticsLog
) : IAnalytics {

    override fun logEvent(eventName: String, eventMap: MutableMap<String, String>) {
        logger.log(eventName, eventMap)
    }

}