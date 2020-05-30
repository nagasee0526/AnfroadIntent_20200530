package com.ubis.anfroadintent_20200530

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DialBtn.setOnClickListener {

            val inputPhoneNum = PhoneNumEdt.text.toString()

            val MyUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, MyUri)
            startActivity(myIntent)
        }

        CallBtn.setOnClickListener {

            val inputPhoneNum = PhoneNumEdt.text.toString()

            val MyUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent2 = Intent(Intent.ACTION_CALL, MyUri)
            startActivity(myIntent2)

        }

    }
}
