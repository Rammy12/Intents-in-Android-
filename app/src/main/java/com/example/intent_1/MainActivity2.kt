package com.example.intent_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val Name=intent.getStringExtra(KEY_1)
        val p=intent.getStringExtra(KEY_2)
        val a=intent.getStringExtra(KEY_3)
        name.text=Name
        p_number.text=p
        age.text=a
    }
}