package com.mahfuznow.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerLaptopComponent is a generated class
        //It will be generated if we build our project after using @component annotation
        val laptopComponent = DaggerLaptopComponent.create()
        val laptop = laptopComponent.getLaptop()
        laptop.build()
    }
}