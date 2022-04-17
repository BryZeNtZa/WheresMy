package com.geosurveyor.wheres.my

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.geosurveyor.wheres.my.databinding.ActivityWheresMyMottoBinding
import com.geosurveyor.wheres.my.fragments.WheresMyMottoOneFragment
import com.geosurveyor.wheres.my.fragments.WheresMyMottoTwoFragment

class WheresMyMotto : AppCompatActivity() {

    private lateinit var binding: ActivityWheresMyMottoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = ActivityWheresMyMottoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        val adapter = MottoPagerAdapter(this)
        val fragsList = listOf(WheresMyMottoOneFragment(), WheresMyMottoTwoFragment())
        adapter.fragmentList.addAll(fragsList)

        binding.wheresMyMottoViewPager.adapter = adapter
        binding.wheresMyMottoViewPager.currentItem = 0
    }

    // view pager adapter
    class MottoPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
        val fragmentList = mutableListOf<Fragment>()
        override fun getItemCount():Int = fragmentList.size
        override fun createFragment(position: Int): Fragment = fragmentList[position]
    }

}