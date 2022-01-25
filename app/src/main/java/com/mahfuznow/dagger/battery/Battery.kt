package com.mahfuznow.dagger.battery


interface Battery {
    fun charge()
    fun discharge()
    override fun toString(): String
}