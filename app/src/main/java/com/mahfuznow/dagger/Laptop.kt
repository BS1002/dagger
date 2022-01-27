package com.mahfuznow.dagger

import android.util.Log
import com.mahfuznow.dagger.battery.LithiumIonBattery
import com.mahfuznow.dagger.processor.IntelProcessor
import javax.inject.Inject

// When @Inject is annotated on a class constructor, it's telling Dagger how to provide instances of that class.
// When it's annotated on a class field, it's telling Dagger that it needs to populate the field with an instance of that type.

class Laptop @Inject constructor() {

    //Field Injection
    @Inject
    lateinit var processor: IntelProcessor
    @Inject
    lateinit var battery: LithiumIonBattery

    fun build() {
        Log.d("TAG", "Laptop is built with $processor and $battery")
    }
}