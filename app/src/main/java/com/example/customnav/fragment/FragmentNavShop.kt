package com.example.customnav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.customnav.databinding.FragmentTestBinding

class FragmentNavShop: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        val binding=FragmentTestBinding.inflate(LayoutInflater.from(context))
        binding.txtView.text="Shop"
        return binding.root

    }


}