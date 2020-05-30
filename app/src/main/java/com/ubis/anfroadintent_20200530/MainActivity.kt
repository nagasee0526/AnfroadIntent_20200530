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
            val myIntent = Intent(Intent.ACTION_CALL, MyUri)
            startActivity(myIntent)
        }

        SendtoBtn.setOnClickListener {

            val inputPhoneNum = PhoneNumEdt.text.toString()

            val MySmsto = Uri.parse("smsto:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_SENDTO, MySmsto)
            myIntent.putExtra("sms_body", "[광고] 입니다.")
            startActivity(myIntent)
        }

        NaverLinkBtn.setOnClickListener {

            val myUri = Uri.parse("http://naver.com")

            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)
        }

        KaKaoStoreLinkBtn.setOnClickListener {

            val myUri = Uri.parse("market://details?id=com.kakao.talk")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)

        }
    }
}
