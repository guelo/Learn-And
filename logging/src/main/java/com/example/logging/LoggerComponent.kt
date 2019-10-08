package com.example.logging

import dagger.Binds
import dagger.Component
import dagger.Module

interface LoggerProvides {
    fun logger(): ILogger
}

@Component(modules = [LoggerModule::class])
interface LoggerComponent: LoggerProvides {

    companion object {
        fun init(): LoggerComponent {
            Injector = DaggerLoggerComponent.create()
            return Injector
        }
    }
}

@Module
internal interface LoggerModule {
    @Binds fun logger(androidLog: AndroidLog): ILogger
}

internal lateinit var Injector: LoggerComponent
    private set
