package com.gaali.learnand

import android.content.Context
import com.gaali.core.di.CoreComponent
import dagger.Component
import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppSingleton

@AppSingleton
@Component(dependencies = [CoreComponent::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    companion object {
        fun init(applicationContext: Context) {

            val coreComponent = CoreComponent.init()

            Injector = DaggerAppComponent.builder().coreComponent(coreComponent).build()

        }
    }

}

internal lateinit var Injector: AppComponent
    private set
