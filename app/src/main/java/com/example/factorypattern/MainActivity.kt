package com.example.factorypattern

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.factorypattern.data.CarFactory
import com.example.factorypattern.data.Sedan
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var carFactory: CarFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)

        val sedan: Sedan? = carFactory.get(Sedan::class.java)

        Log.d("DaggerFactory", sedan?.getDescription() ?: "sedan is null")
    }
}
