package com.mahfuznow.dagger

import android.util.Log
import com.mahfuznow.dagger.battery.Battery
import com.mahfuznow.dagger.processor.Processor


class Laptop (private val processor: Processor, private val battery: Battery) {
    fun build() {
        Log.d("TAG", "Laptop is built with $processor and $battery")
    }
}