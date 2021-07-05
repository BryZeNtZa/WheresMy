package com.geosurveyor.wheres.my

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.geosurveyor.wheres.my.databinding.ActivityWheresMyMottoBinding
import com.geosurveyor.wheres.my.databinding.ActivityWheresMySplashBinding

class WheresMySplash : AppCompatActivity() {

    private lateinit var binding: ActivityWheresMySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = ActivityWheresMySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        val logoLauncher = LogoLauncher()
        logoLauncher.start()
    }

    private inner class LogoLauncher : Thread() {
        override fun run() {
            try {
                sleep(3000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            gotoSplashActivity()
        }
    }

    fun gotoSplashActivity() {
        val intent = Intent(this, WheresMyMotto::class.java)
        startActivity(intent)
        this.finish()
    }
}