package com.drdlee.daggermultibinding

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey

@Module
class MyModule {

    /**
     * Set
     */

    @Provides
    @IntoSet
    fun myString1(): String {
      return "This is first String"
    }

    @Provides
    @IntoSet
    fun myString2(): String {
        return "This is second String"
    }

    /**
     * Map
     */

    @Provides
    @IntoMap
    @StringKey("myfirst")
    fun myFirstMapString(): String {
        return "This is first map string"
    }

    @Provides
    @IntoMap
    @StringKey("mysecond")
    fun mySecondMapString(): String {
        return "This is second map string"
    }
}