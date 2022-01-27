package com.mahfuznow.dagger

import android.util.Log
import com.mahfuznow.dagger.battery.LithiumIonBattery
import com.mahfuznow.dagger.processor.IntelProcessor
import javax.inject.Inject

// @Inject tells Dagger how to provide instances of this type
// Dagger also knows that IntelProcessor and LithiumIonBattery are two dependency of this class
// And will provide the instance of those dependency if it knows how to instantiate them
class Laptop @Inject constructor  (private val processor: IntelProcessor, private val battery: LithiumIonBattery) {
    fun build() {
        Log.d("TAG", "Laptop is built with $processor and $battery")
    }
}