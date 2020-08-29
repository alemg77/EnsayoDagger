package com.a6.ensayodagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a6.ensayodagger.di.App
import com.a6.ensayodagger.models.Body
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var body: Body

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as App).getComponent().inject(this)

        body
    }


}