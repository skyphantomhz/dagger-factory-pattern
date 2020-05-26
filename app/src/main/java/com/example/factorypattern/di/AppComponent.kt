package com.example.factorypattern.di

import com.example.factorypattern.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Component(modules = [AndroidInjectionModule::class, ActivityModule::class, CarModule::class])
@Singleton
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: MainApplication): Builder

        fun build(): AppComponent
    }

    override fun inject(application: MainApplication)
}