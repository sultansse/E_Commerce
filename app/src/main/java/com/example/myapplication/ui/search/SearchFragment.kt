package com.example.myapplication.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R
import com.example.myapplication.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager2)
        viewPager.adapter = ViewPagerAdapter(types)
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = types[position].name
        }.attach()
    }

    companion object {
        val types = listOf(
            SearchType(colorResource = android.R.color.black, name = "For him"),
            SearchType(colorResource = android.R.color.holo_red_light, name = "For her"),
            SearchType(colorResource = android.R.color.holo_blue_dark, name = "Kids"),
            SearchType(colorResource = android.R.color.holo_purple, name = "Other"),
        )
        private val colors = intArrayOf(
            android.R.color.black,
            android.R.color.holo_red_light,
            android.R.color.holo_blue_dark,
            android.R.color.holo_purple
        )

        data class SearchType(
            val colorResource: Int,
            val name: String,
        )
    }

}