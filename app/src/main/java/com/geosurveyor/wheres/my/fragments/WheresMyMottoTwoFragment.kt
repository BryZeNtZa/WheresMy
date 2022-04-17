package com.geosurveyor.wheres.my.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.geosurveyor.wheres.my.MainActivity
import com.geosurveyor.wheres.my.R

class WheresMyMottoTwoFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        val fg = inflater.inflate(R.layout.fragment_wheres_my_motto_two, container, false)
        val btn = fg.findViewById<Button>(R.id.btn_i_got_it)
        btn.setOnClickListener { gotoMainActivity() }
        return fg
    }
    private fun gotoMainActivity() {
        val intent = Intent(context, MainActivity::class.java)
        startActivity(intent)
        activity?.finish()
    }
}