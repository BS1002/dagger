package com.mahfuznow.dagger.processor

import com.mahfuznow.dagger.processor.register.Register

interface Processor {
    val register: Register

    fun process()
    override fun toString(): String
}