package com.mahfuznow.dagger

import dagger.Component

@Component
interface LaptopComponent {
    //We are telling dagger to provide the dependencies which are annotated with @Inject (field injection) in the MainActivity
    //function name can be anything
    //Here we cant use superclass like AppCompatActivity
    //For each activity we need to declare separate inject function responsible for that activity only
    fun inject(mainActivity: MainActivity)
}