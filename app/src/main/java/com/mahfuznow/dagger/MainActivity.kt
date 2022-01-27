package com.mahfuznow.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //Field Injection
    // @Inject annotated fields will be provided by Dagger
    @Inject
    lateinit var laptop: Laptop

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerLaptopComponent is a generated class
        //It will be generated if we build our project after using @component annotation
        val laptopComponent = DaggerLaptopComponent.create()
        //Instantiating the variables using field injection
        laptopComponent.inject(this)
        laptop.build()
    }
}