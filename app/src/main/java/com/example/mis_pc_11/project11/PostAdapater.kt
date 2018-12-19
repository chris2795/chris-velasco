package com.example.mis_pc_11.project11

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import java.nio.file.attribute.UserDefinedFileAttributeView
import kotlin.coroutines.experimental.coroutineContext

class PostAdapater(val home: ArrayList<User>): RecyclerView.Adapter<PostAdapater.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PostAdapater.ViewHolder {
        val view: View = LayoutInflater.from(p0.context).inflate(R.layout.row_post, p0, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return home.size
    }

    override fun onBindViewHolder(p0: PostAdapater.ViewHolder, p1: Int) {
        val user: User = home[p1]

        p0?.FirstName?.text = user.name

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val FirstName = itemView.findViewById(R.id.FirstName) as TextView



    }
}





