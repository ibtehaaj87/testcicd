package com.example.testcicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    var Hello by Delegates.notNull<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun un() {
        val a =2
    }
}