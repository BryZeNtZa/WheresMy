package com.geosurveyor.wheres.my.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geosurveyor.wheres.my.R

import com.geosurveyor.wheres.my.databinding.FragmentWheresMyMottoOneBinding

class WheresMyMottoOneFragment : Fragment() {

    private lateinit var binding: FragmentWheresMyMottoOneBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        return inflater.inflate(R.layout.fragment_wheres_my_motto_one, container, false)
    }
}