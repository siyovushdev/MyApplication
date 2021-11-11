package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.VideoView
import java.io.IOException
import java.lang.Exception
import java.lang.IndexOutOfBoundsException


class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        val video = "android.resource://" + packageName + "/" + R.raw.left;
        val videoView: VideoView = findViewById(R.id.surfaceViewLeft)
        videoView.setVideoURI(Uri.parse(video))
        videoView.start()

        val video2 = "android.resource://" + packageName + "/" + R.raw.right;
        val videoView2: VideoView = findViewById(R.id.surfaceViewRight)
        videoView2.setVideoURI(Uri.parse(video2))
        videoView2.start()


        videoView.setOnPreparedListener {
            it.isLooping = true
        }

        videoView2.setOnPreparedListener {
            it.isLooping = true
        }

    }

}