package com.drdlee.daggermultibinding

import dagger.Component

@Component(modules = [MyModule::class])
interface MyComponent {

    fun stringSetValues(): Set<String>
    fun stringMapValues(): Map<String, String>

}