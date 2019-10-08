package com.gaali.core.di

import com.example.logging.LoggerComponent
import com.gaali.core.appinterfaces.IAppAnalytics
import com.gaali.core.appinterfaces.mappers.IAnalyticsToIAppAnalytics
import com.gaali.core.appinterfaces.mappers.IAppLogToIAnalyticsLog
import com.gaali.core.appinterfaces.IAppLog
import com.gaali.core.appinterfaces.IAppPlayer
import com.gaali.core.appinterfaces.mappers.ILogToAppLog
import com.gaali.core.appinterfaces.mappers.IPlayerToIAppPlayer
import com.gaali.core.appinterfaces.mappers.IAppLogToIPlayerLog
import com.gaali.player.PlayerComponent
import com.ggaali.analytics.AnalyticsComponent
import dagger.Binds
import dagger.Component
import dagger.Module
import javax.inject.Singleton

interface CoreProvides {
    fun logger(): IAppLog
    fun player(): IAppPlayer
    fun analytics(): IAppAnalytics
}

@Singleton
@Component(
    dependencies = [
        LoggerComponent::class,
        PlayerComponent::class,
        AnalyticsComponent::class
    ],
    modules = [
        CoreModule::class,
        CoreInterfaceBindings::class
    ]
)
interface CoreComponent : CoreProvides {

    companion object {
        fun init(): CoreComponent {
            val loggerComponent = LoggerComponent.init()
            val appLog = ILogToAppLog(loggerComponent.logger())

            val playerComponent = PlayerComponent.init(
                IAppLogToIPlayerLog(
                    appLog
                )
            )

            val analyticsComponent = AnalyticsComponent.init(
                IAppLogToIAnalyticsLog(
                    appLog
                )
            )

            return DaggerCoreComponent
                .builder()
                .loggerComponent(loggerComponent)
                .playerComponent(playerComponent)
                .analyticsComponent(analyticsComponent)
                .build()
        }
    }
}

@Module
internal interface CoreInterfaceBindings {
    @Binds fun logger(mapper: ILogToAppLog): IAppLog

    @Binds fun player(mapper: IPlayerToIAppPlayer): IAppPlayer

    @Binds fun analytics(mapper: IAnalyticsToIAppAnalytics): IAppAnalytics
}