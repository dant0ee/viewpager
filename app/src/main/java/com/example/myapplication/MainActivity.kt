package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapterebi.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager : ViewPager2
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout= findViewById(R.id.tab1)
        viewPager= findViewById(R.id.viewpager)
        viewPagerFragmentAdapter= ViewPagerFragmentAdapter(this)
        viewPager.adapter=viewPagerFragmentAdapter
        TabLayoutMediator(tabLayout, viewPager){
            tab, position ->
            tab.text="tab ${position.1}"
        }.attach()
    }
}