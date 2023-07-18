package com.example.testcicd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ObservableField
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    var hello = ObservableField<String>("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val oyeee = 123423423

    }

    companion object {
        const val OYEE = "fhjniusdhfiuashf"
    }

}