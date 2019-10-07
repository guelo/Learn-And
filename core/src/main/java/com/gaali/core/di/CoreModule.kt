package com.gaali.core.di

import com.gaali.core.analytics.IAppAnalytics
import com.gaali.core.analytics.impl.SxmpAnalytics
import com.gaali.core.log.impl.AndroidLog
import com.gaali.core.log.IAppLog
import com.gaali.core.analytics.mapper.AnalyticsLogMapper
import com.gaali.core.player.mapper.PlayerLogMapper
import com.gaali.core.player.IAppPlayer
import com.gaali.core.player.impl.SxmpPlayer
import com.gaali.player.ExoPlayer
import com.gaali.player.IPlayerLog
import com.ggaali.analytics.impl.FirebaseAnalytics
import com.ggaali.analytics.IAnalyticsLog
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {

    @Singleton
    @Provides
    fun providesAppLogger(): IAppLog {
        return AndroidLog()
    }

    @Singleton
    @Provides
    fun providesSxmPlayer(playerLog: IPlayerLog): IAppPlayer {
        return SxmpPlayer(ExoPlayer(playerLog))
    }

    @Singleton
    @Provides
    fun provideAppAnalytics(analyticLog: IAnalyticsLog): IAppAnalytics {
        return SxmpAnalytics(FirebaseAnalytics(analyticLog))
    }

    //Mappers
    @Provides
    fun providesPlayerLogMapper(iAppLog: IAppLog): IPlayerLog {
        return PlayerLogMapper(iAppLog)
    }

    @Provides
    fun provideAnalyticLogMapper(iAppLog: IAppLog): IAnalyticsLog {
        return AnalyticsLogMapper(iAppLog)
    }

}