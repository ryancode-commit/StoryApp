package com.ra.storyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.ra.storyapp.utils.SharedPreference

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var prefs : SharedPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        prefs = SharedPreference(this)
        val isLogin = prefs.isLogin


        Handler(Looper.getMainLooper()).postDelayed({
            when{
                isLogin ->{
                    val intent = Intent(this,MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }else ->{
                    val intent = Intent(this,LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }, 1000)
    }
}