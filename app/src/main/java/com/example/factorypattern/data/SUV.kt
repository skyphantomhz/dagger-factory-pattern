package com.example.factorypattern.data

import javax.inject.Inject

class SUV @Inject constructor(): Car(){
    override fun getDescription(): String {
        return "Sport utility vehicle (SUV) is a category of motor vehicles that combine elements of road-going passenger cars with features from off-road vehicles, such as raised ground clearance and four-wheel drive."
    }
}