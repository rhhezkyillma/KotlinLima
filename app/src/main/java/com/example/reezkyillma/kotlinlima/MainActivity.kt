package com.example.reezkyillma.kotlinlima

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var twitter: ImageView = findViewById(R.id.twitter)
        var facebook: ImageView = findViewById(R.id.facebook)
        var instagram: ImageView = findViewById(R.id.instagram)
        var github: ImageView = findViewById(R.id.github)

        name.text = "Reezky Illma"


        twitter.setOnClickListener {
           val webpage = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/rhhezky"))
            startActivity(webpage)
        }

        facebook.setOnClickListener {
            val webpage = Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/rezkycaroline"))
            startActivity(webpage)
        }
        instagram.setOnClickListener {
            val webpage = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/rhhezkyillma"))
            startActivity(webpage)
        }
        github.setOnClickListener {
            val webpage = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rhhezkyillma"))
            startActivity(webpage)
        }




    }
}
