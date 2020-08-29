package com.a6.ensayodagger.di

import com.a6.ensayodagger.MainActivity
import dagger.Component


@Component(modules = [MiPrimerModulo::class])
interface MiPrimeraInterfaseDagger {

    fun inject(mainActivity: MainActivity)
}

