package com.example.mis_pc_11.project11

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

            recyclerView.layoutManager = LinearLayoutManager(this, OrientationHelper.HORIZONTAL, false)

            val users = arrayListOf<User>()
                users.add(User("Home"))
        users.add(User("Home"))
        users.add(User("Home"))
        users.add(User("Home"))
        users.add(User("Home"))
        users.add(User("Home"))
        users.add(User("Home"))

        val adapter = PostAdapater(users)



    recyclerView.adapter = adapter

    }


}


