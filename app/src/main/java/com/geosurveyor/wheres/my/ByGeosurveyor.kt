package com.geosurveyor.wheres.my

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.geosurveyor.wheres.my.databinding.ActivityByGeosurveyorBinding

class ByGeosurveyor : AppCompatActivity() {

    private lateinit var binding: ActivityByGeosurveyorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = ActivityByGeosurveyorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        val logoLauncher = LogoLauncher()
        logoLauncher.start()
    }

    private inner class LogoLauncher : Thread() {
        override fun run() {
            try {
                sleep(4000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            gotoSplashActivity()
        }
    }

    fun gotoSplashActivity() {
        val intent = Intent(this, WheresMySplash::class.java)
        startActivity(intent)
        this.finish()
    }
}