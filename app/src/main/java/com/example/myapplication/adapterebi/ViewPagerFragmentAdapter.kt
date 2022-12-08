package com.example.myapplication.adapterebi

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragmentebi.MeoreFragmenti
import com.example.myapplication.fragmentebi.MesameFragmenti
import com.example.myapplication.fragmentebi.PirveliFragmenti


class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        if (position==0){
            return  PirveliFragmenti()
        }else if (position==1){
            return MeoreFragmenti()
        }else if(position ==2){
            return MesameFragmenti()
        }else{
            return Fragment()
        }
    }
}
