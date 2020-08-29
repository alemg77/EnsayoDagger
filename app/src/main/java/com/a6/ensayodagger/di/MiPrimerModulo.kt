package com.a6.ensayodagger.di

import com.a6.ensayodagger.models.Arm
import com.a6.ensayodagger.models.Body
import com.a6.ensayodagger.models.Head
import com.a6.ensayodagger.models.Leg
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MiPrimerModulo {


    @Provides
    fun provideHead() = Head( "Cabeza")

    @Provides
    @Named("armR")
    fun provideArmR() = Arm( "Brazo Derecho")

    @Provides
    @Named("armL")
    fun provideArmL() = Arm( "Brazo Izquierdo")

    @Provides
    @Named("legR")
    fun provideLegR() = Leg( "Pierna Derecho")

    @Provides
    @Named("legL")
    fun provideLegL() = Leg( "Pierna Izquierdo")

    @Provides
    fun provideBody(head: Head,
                    @Named("armR") armR: Arm,
                    @Named("armL") armL: Arm,
                    @Named( "legR") legR: Leg,
                    @Named( "legL") legL: Leg
                    ) = Body(head, armR, armL, legR, legL)

}