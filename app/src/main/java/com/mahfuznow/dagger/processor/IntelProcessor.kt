package com.mahfuznow.dagger.processor

import android.util.Log
import com.mahfuznow.dagger.processor.register.Register

class IntelProcessor (override val register: Register): Processor {

    override fun process() {
        Log.d("TAG", "Intel Processor is Processing")
    }
    override fun toString(): String {
        return "Intel Processor"
    }
}