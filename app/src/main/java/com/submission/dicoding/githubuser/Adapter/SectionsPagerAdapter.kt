package com.submission.dicoding.githubuser.Adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.submission.dicoding.githubuser.Fragment.FollowerFragment
import com.submission.dicoding.githubuser.Fragment.FollowingFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    var username: String = ""

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = FollowerFragment()
            1 -> fragment = FollowingFragment()
        }
        fragment?.arguments = Bundle().apply {
            putString(FollowerFragment.USERNAME, username)
            putString(FollowingFragment.USERNAME, username)
        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int {
        return 2
    }
}