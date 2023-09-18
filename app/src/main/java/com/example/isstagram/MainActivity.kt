package com.example.isstagram


import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



      Toast.makeText (  this, "App is running" , Toast.LENGTH_SHORT).show()
      val image = findViewById<ImageView>(R.id.insta)

        image.setOnClickListener(){
            Toast.makeText (  this, "App is running" , Toast.LENGTH_SHORT).show()

        }


    }
}