package com.cesaralejandro.collaborativeboard.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cesaralejandro.collaborativeboard.R
import com.cesaralejandro.collaborativeboard.fragments.adapters.TaskRecyclerViewAdapter
import com.cesaralejandro.collaborativeboard.models.Task

class ToDoFragment : Fragment() {

    private lateinit var todoTasks: MutableList<Task>
    private lateinit var recyclerAdapter: TaskRecyclerViewAdapter
    private lateinit var todoRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpList()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_to_do, container, false)
        val layoutManager = LinearLayoutManager(requireContext())
        todoRecyclerView = view.findViewById(R.id.toDoRecyclerView)
        recyclerAdapter = TaskRecyclerViewAdapter(todoTasks)
        todoRecyclerView.layoutManager = layoutManager
        todoRecyclerView.adapter = recyclerAdapter
        return view

    }


    private fun setUpList(){
        todoTasks = mutableListOf()
        for(i in 1..20){
            todoTasks.add(Task(
                "Maquetación de la Landing page",
                "Se debe hacer el diseño de la barra de navegación, la disposición de las imágenes y revisar el contenido que se va a usar"
            ))
        }
    }
}