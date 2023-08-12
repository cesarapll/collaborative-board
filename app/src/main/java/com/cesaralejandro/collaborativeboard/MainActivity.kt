package com.cesaralejandro.collaborativeboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.cesaralejandro.collaborativeboard.fragments.adapters.TaskFragmentPageAdapter
import com.cesaralejandro.collaborativeboard.models.Task
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: TaskFragmentPageAdapter
    private lateinit var tabs: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabs = listOf("To do", "In progress", "Done")

        viewPager2 = findViewById(R.id.viewPager2)
        adapter = TaskFragmentPageAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter
        tabLayout = findViewById(R.id.tabLayout)
        TabLayoutMediator(tabLayout, viewPager2) {
            tab, position ->
                tab.text = tabs[position]
        }.attach()

    }

}

