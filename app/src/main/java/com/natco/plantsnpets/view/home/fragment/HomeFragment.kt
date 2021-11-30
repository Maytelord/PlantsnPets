package com.natco.plantsnpets.view.home.fragment
/*
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.natco.plantsnpets.R
import com.natco.plantsnpets.adapters.HomeViewPagerAdapter
import com.natco.plantsnpets.databinding.HomeFragmentBinding




class HomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = HomeFragmentBinding.inflate(inflater, container, false)
        context ?: return binding.root
        val navLayout = binding.homeBV
        val viewPager = binding.viewPager

        viewPager.adapter = HomeViewPagerAdapter(this)

        navLayout.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.nav_search-> viewPager.currentItem = 0
                R.id.nav_suggestions -> viewPager.currentItem = 1
            }
            true
        }

        viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                navLayout.menu.getItem(position).isChecked = true;
            }
        })



        return binding.root
    }
}*/