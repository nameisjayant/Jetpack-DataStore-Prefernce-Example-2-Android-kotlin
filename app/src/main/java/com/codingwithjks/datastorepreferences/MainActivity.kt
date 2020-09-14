package com.codingwithjks.datastorepreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.codingwithjks.datastorepreferences.ViewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.readFromDataStore.observe(this, Observer {
            data.text=it
        })
         setValue()
    }

    private fun setValue() {
        save.setOnClickListener {
            val getName=name.text.toString().trim()
            mainViewModel.saveToDataStore(getName)
        }
    }
}