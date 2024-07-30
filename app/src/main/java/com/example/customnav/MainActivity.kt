package com.example.customnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.customnav.databinding.ActivityMainBinding
import com.example.customnav.fragment.*

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // در حالت پیشفرض خانه را نمایش دهد
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.framelayout, FragmentNavHome())
            .commit()

        binding.customNavButen.onClickHelper(
            object : ActivItem {

                override fun setFragment(type: FragmentType) {
                    val fragment = when(type) {
                        FragmentType.HOME -> FragmentNavHome()
                        FragmentType.SHOP -> FragmentNavShop()
                        FragmentType.SEARCH -> FragmentNavSearch()
                        FragmentType.SETTING -> FragmentNavSetiing()
                        FragmentType.PROFILE -> FragmentNavProfile()
                    }
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout, fragment)
                        .commit()
                }

            }
        )
    }
}
