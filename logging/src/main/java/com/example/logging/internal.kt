package com.example.logging

import dagger.Binds
import dagger.Component
import dagger.Module

interface Interface

internal class Impl: Interface

@Module
internal interface Module {
    @Binds fun bind(impl: Impl): Interface
}

@Component
interface Component {

}