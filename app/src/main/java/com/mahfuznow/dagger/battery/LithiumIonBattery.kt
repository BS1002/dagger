package com.mahfuznow.dagger.battery

import android.util.Log

class LithiumIonBattery: Battery {
    override fun charge() {
        Log.d("TAG", "Lithium Ion Battery is charging")
    }

    override fun discharge() {
        Log.d("TAG", "Lithium Ion Battery is discharging")
    }

    override fun toString(): String {
        return "Lithium-Ion Battery"
    }
}