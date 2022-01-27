package com.mahfuznow.dagger

import dagger.Component

@Component
interface LaptopComponent {
    //this method is called Provision methods
    //here, only important thing is the return type
    //function name can be anything
    //these functions will serve as a template to generate DaggerLaptopComponent class
    fun getLaptop(): Laptop
}