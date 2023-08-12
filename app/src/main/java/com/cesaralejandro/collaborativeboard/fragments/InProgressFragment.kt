package com.cesaralejandro.collaborativeboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.cesaralejandro.collaborativeboard.R
import com.cesaralejandro.collaborativeboard.models.Task


class InProgressFragment : Fragment() {

    private lateinit var inProgressTasks: MutableList<Task>

    private lateinit var inProgressRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_to_do, container, false)
    }

}