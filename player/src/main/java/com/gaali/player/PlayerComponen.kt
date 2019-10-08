package com.gaali.player

import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Module

interface PlayerProvides {
    fun player(): IPlayer
}

@Component(modules = [PlayerModule::class])
interface PlayerComponent : PlayerProvides {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance logger: IPlayerLog): PlayerComponent
    }

    companion object {

        fun init(iPlayerLog: IPlayerLog): PlayerComponent {
            return DaggerPlayerComponent.factory().create(iPlayerLog)
        }
    }
}

@Module
internal interface PlayerModule {
    @Binds
    fun logger(impl: ExoPlayer): IPlayer
}
