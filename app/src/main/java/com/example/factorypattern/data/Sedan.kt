package com.example.factorypattern.data

import javax.inject.Inject

class Sedan @Inject constructor(): Car() {
    override fun getDescription(): String {
        return "A sedan /sɪˈdæn/, or saloon, is a passenger car in a three-box configuration with separate compartments for engine, passenger, and cargo."
    }
}