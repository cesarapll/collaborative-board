package com.cesaralejandro.collaborativeboard.fragments.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cesaralejandro.collaborativeboard.R
import com.cesaralejandro.collaborativeboard.models.Task

class TaskRecyclerViewAdapter(private val tasks: MutableList<Task>): RecyclerView.Adapter<TaskRecyclerViewAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val taskTitle: TextView = view.findViewById(R.id.task_title)
        val taskDescription: TextView = view.findViewById(R.id.task_descripcion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val task = tasks[position]
        holder.apply {
            taskTitle.text = task.title
            taskDescription.text = task.description
        }
    }

    override fun getItemCount(): Int {
        return tasks.size
    }
}

