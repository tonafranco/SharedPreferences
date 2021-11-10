package com.practicasii.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleFromPrefs = resources.getString(R.string.title_text)
        val appName = resources.getString(R.string.app_name)
        val unBoolean = resources.getBoolean(R.bool.keyforboolean1)
        val unInteger = resources.getInteger(R.integer.keyforintegerexample)
        Log.d("SAVEDVALUES", "$appName $titleFromPrefs $unBoolean $unInteger")

        val titulo = findViewById<TextView>(R.id.tvTitle)
        val switchUno = findViewById<Switch>(R.id.switch_1)
        val switchDos = findViewById<Switch>(R.id.switch_2)
        val switchTres = findViewById<Switch>(R.id.switch_3)
        val switchCuatro = findViewById<Switch>(R.id.switch_4)


        titulo.setText(titleFromPrefs)
        switchUno.isChecked = resources.getBoolean(R.bool.keyforboolean1)
        switchDos.isChecked = resources.getBoolean(R.bool.keyforboolean2)
        switchTres.isChecked = resources.getBoolean(R.bool.keyforboolean3)
        switchCuatro.isChecked = resources.getBoolean(R.bool.keyforboolean4)


    }
}