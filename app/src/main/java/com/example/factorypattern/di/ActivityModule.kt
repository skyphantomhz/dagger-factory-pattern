package com.example.factorypattern.di

import com.example.factorypattern.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}