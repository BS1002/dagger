package com.mahfuznow.dagger.battery

import android.util.Log
import javax.inject.Inject

class LithiumPolymerBattery @Inject constructor(): Battery {
    override fun charge() {
        Log.d("TAG", "Lithium Polymer Battery is charging")
    }

    override fun discharge() {
        Log.d("TAG", "Lithium Polymer Battery is discharging")
    }

    override fun toString(): String {
        return "Lithium-Polymer Battery"
    }
}