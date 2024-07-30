package com.example.customnav


enum class FragmentType {
    SHOP,HOME,SETTING,PROFILE,SEARCH
}

interface ActivItem {
    fun setFragment(type: FragmentType)
}