package com.cesaralejandro.collaborativeboard.fragments.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cesaralejandro.collaborativeboard.fragments.DoneFragment
import com.cesaralejandro.collaborativeboard.fragments.InProgressFragment
import com.cesaralejandro.collaborativeboard.fragments.ToDoFragment

class TaskFragmentPageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3;
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ToDoFragment()
            1 -> InProgressFragment()
            2 -> DoneFragment()
            else -> ToDoFragment()
        }
    }
}