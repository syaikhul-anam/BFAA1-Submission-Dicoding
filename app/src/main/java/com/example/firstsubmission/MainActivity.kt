package com.example.firstsubmission

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firstsubmission.adapter.UserViewAdapter
import com.example.firstsubmission.databinding.ActivityMainBinding
import com.example.firstsubmission.model.UserData


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
    }

    override fun onResume() {
        super.onResume()
        mainBinding.rvListUser.adapter = UserViewAdapter(UserData.getUsers())
        mainBinding.rvListUser.layoutManager = LinearLayoutManager(this)
    }


}