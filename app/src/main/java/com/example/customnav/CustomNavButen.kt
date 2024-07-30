package com.example.customnav

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.customnav.databinding.CustoomNavBinding

class CustomNavButen(
    context: Context,
    attrs: AttributeSet
) : FrameLayout(context, attrs) {

    private var binding =
        CustoomNavBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }


    fun onClickHelper(activItem: ActivItem){

        binding.viewHoum.setOnClickListener{
            activeHom()
            activItem.setFragment(FragmentType.HOME)
        }
        binding.viewSearch.setOnClickListener{
            activeSearch()
            activItem.setFragment(FragmentType.SEARCH)

        }
        binding.viewShope.setOnClickListener{
            activeShop()
            activItem.setFragment(FragmentType.SHOP)

        }
        binding.viewSetting.setOnClickListener{
            activeSetiing()
            activItem.setFragment(FragmentType.SETTING)

        }
        binding.viewProfile.setOnClickListener{
            activeProfile()
            activItem.setFragment(FragmentType.PROFILE)

        }
    }

    // مشخص کردن بک گراند بعد از کلیک روی باطن
    fun activeHom(){
        binding.viewHoum.setBackgroundResource(R.drawable.back_item_sayeh)
        binding.viewSetting.background=null
        binding.viewSearch.background=null
        binding.viewProfile.background=null
        binding.viewShope.background=null
    }

    fun activeShop(){
        binding.viewShope.setBackgroundResource(R.drawable.back_item_sayeh)
        binding.viewSetting.background=null
        binding.viewSearch.background=null
        binding.viewProfile.background=null
        binding.viewHoum.background=null
    }

    fun activeProfile(){
        binding.viewProfile.setBackgroundResource(R.drawable.back_item_sayeh)
        binding.viewSetting.background=null
        binding.viewSearch.background=null
        binding.viewShope.background=null
        binding.viewHoum.background=null
    }

    fun activeSetiing(){
        binding.viewSetting.setBackgroundResource(R.drawable.back_item_sayeh)
        binding.viewProfile.background=null
        binding.viewSearch.background=null
        binding.viewShope.background=null
        binding.viewHoum.background=null
    }

    fun activeSearch(){
        binding.viewSearch.setBackgroundResource(R.drawable.back_item_sayeh)
        binding.viewProfile.background=null
        binding.viewSetting.background=null
        binding.viewShope.background=null
        binding.viewHoum.background=null
    }
}