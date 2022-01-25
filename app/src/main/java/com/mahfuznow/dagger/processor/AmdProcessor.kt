package com.mahfuznow.dagger.processor

import android.util.Log
import com.mahfuznow.dagger.processor.register.Register

class AmdProcessor (override val register: Register): Processor {
    override fun process() {
        Log.d("TAG", "AMD Processor is Processing")
    }
    override fun toString(): String {
        return "AMD Processor"
    }
}