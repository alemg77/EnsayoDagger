package com.a6.ensayodagger.di

import android.app.Application
import com.a6.ensayodagger.di.MiPrimeraInterfaseDagger

class App: Application() {

    private lateinit var miPrimeraInterfaseDagger: MiPrimeraInterfaseDagger


    override fun onCreate() {
        super.onCreate()

        miPrimeraInterfaseDagger = DaggerMiPrimeraInterfaseDagger
            .builder()
            .miPrimerModulo(MiPrimerModulo())
            .build()

    }

    fun getComponent() = miPrimeraInterfaseDagger


}
