package com.ggaali.analytics

import com.ggaali.analytics.impl.FirebaseAnalytics
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Module

interface AnalyticsProvides {
    fun player(): IAnalytics
}

@Component(modules = [AnalyticsModule::class])
interface AnalyticsComponent : AnalyticsProvides {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance logger: IAnalyticsLog): AnalyticsComponent
    }

    companion object {

        fun init(iAnalyticsLog: IAnalyticsLog): AnalyticsComponent {
            return DaggerAnalyticsComponent.factory().create(iAnalyticsLog)
        }
    }
}

@Module
internal interface AnalyticsModule {
    @Binds
    fun analytics(impl: FirebaseAnalytics): IAnalytics
}
