package com.example.factorypattern.di

import com.example.factorypattern.data.Car
import com.example.factorypattern.data.SUV
import com.example.factorypattern.data.Sedan
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class CarModule {

    @Binds
    @IntoMap
    @ClassKey(Sedan::class)
    abstract fun bindSedan(sedan: Sedan): Car

    @IntoMap
    @Binds
    @ClassKey(SUV::class)
    abstract fun bindSuv(suv: SUV): Car
}