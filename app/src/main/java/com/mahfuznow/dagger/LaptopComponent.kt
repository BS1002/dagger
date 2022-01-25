package com.mahfuznow.dagger

import dagger.Component

@Component
interface LaptopComponent {
    fun getLaptop(): Laptop
}