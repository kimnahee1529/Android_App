package com.example.recyclerview_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dataSet: ArrayList<List<String>> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        addData()
//
//        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
////      recycler_view.layoutManager = GridLayoutManager(this, 2)
//        recycler_view.adapter = RecyclerViewAdapter(dataSet)
//        recycler_view.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addData()
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = RecyclerViewAdapter(dataSet)
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
    private fun addData(){
        for (i in 0..99){
            dataSet.add(listOf("$i th main", "$i th sub"))
        }
    }
}