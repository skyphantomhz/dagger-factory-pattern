package com.example.factorypattern.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CarFactory @Inject constructor(var cars: Map<Class<*>, @JvmSuppressWildcards Car>) {

    fun <T : Car> get(clazz: Class<*>): T {
        return try {
            requireNotNull(cars[clazz] as T) {
                "No Car provider is bound for class"
            }
        } catch (cce: ClassCastException) {
            cce.printStackTrace()
            error("Wrong provider type registered for Car type")
        }
    }
}