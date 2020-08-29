package com.a6.ensayodagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a6.ensayodagger.di.App
import com.a6.ensayodagger.models.Arm
import com.a6.ensayodagger.models.Body
import com.a6.ensayodagger.models.Head
import com.a6.ensayodagger.models.Leg
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var body: Body

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Sin usar dagger el objeto se crearia asi;
        var head = Head("Cabeza loca")
        var arm1 = Arm("Brazo derecho")
        var arm2 = Arm("Brazo iquierdo")

        var body_sin_dagger = Body(head, arm1, arm2,
            Leg("Pierna uno"),
            Leg("Pierna dos")
        )

        val armRname = body_sin_dagger.armR.name

        (application as App).getComponent().inject(this)
        val name = body.armR.name

    }


}