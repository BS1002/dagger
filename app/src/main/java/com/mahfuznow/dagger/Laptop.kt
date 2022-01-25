package com.mahfuznow.dagger

import android.util.Log
import com.mahfuznow.dagger.battery.LithiumIonBattery
import com.mahfuznow.dagger.processor.IntelProcessor
import javax.inject.Inject


class Laptop @Inject constructor  (private val processor: IntelProcessor, private val battery: LithiumIonBattery) {
    fun build() {
        Log.d("TAG", "Laptop is built with $processor and $battery")
    }
}