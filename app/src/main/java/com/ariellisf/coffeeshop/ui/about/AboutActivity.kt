package com.ariellisf.coffeeshop.ui.about
import android.os.Bundle
import com.ariellisf.coffeeshop.MainActivity
import com.ariellisf.coffeeshop.R

class AboutActivity : MainActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}