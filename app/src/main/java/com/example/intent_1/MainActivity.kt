package com.example.intent_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const val KEY_1="Name"
const val KEY_2="P_number"
const val KEY_3="Age"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        send.setOnClickListener {
            val name=name.editableText.toString()
            val p_number=p_number.editableText.toString()
            val age=age.editableText.toString()
            val i=Intent(this,MainActivity2::class.java)
            i.putExtra(KEY_1,name)
            i.putExtra(KEY_2,p_number)
            i.putExtra(KEY_3,age)
            startActivity(i)
        }
        email.setOnClickListener {
            val email =send_email.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_SENDTO
            i.data= Uri.parse("mailto:$email")
            i.putExtra(Intent.EXTRA_SUBJECT,"Hii ramesh")
            startActivity(i)
        }
        brouse.setOnClickListener {
            val addres =send_brouse.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("http://$addres")
            startActivity(i)

        }
        dail.setOnClickListener {
            val mob =send_ph.text.toString()
            val i=Intent()
            i.action=Intent.ACTION_DIAL
            i.data= Uri.parse("tel:$mob")
            startActivity(i)
        }

    }
}