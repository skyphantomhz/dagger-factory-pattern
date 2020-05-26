package com.example.factorypattern

import com.example.factorypattern.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication


class MainApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }
}