package com.mahfuznow.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mahfuznow.dagger.battery.LithiumIonBattery
import com.mahfuznow.dagger.processor.IntelProcessor
import com.mahfuznow.dagger.processor.register.Register
import com.mahfuznow.dagger.processor.register.flip_flop.FlipFlop
import com.mahfuznow.dagger.processor.register.flip_flop.logic_gate.LogicGate
import com.mahfuznow.dagger.processor.register.flip_flop.logic_gate.transistor.Transistor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transistor = Transistor()
        val logicGate = LogicGate(transistor)
        val flipFlop = FlipFlop(logicGate)
        val register = Register(flipFlop)
        val processor = IntelProcessor(register)

        val battery = LithiumIonBattery()

        val laptop = Laptop(processor, battery)
        laptop.build()
    }
}