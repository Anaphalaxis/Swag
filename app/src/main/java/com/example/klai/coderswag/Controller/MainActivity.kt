package com.example.klai.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.klai.coderswag.Adapters.CategoryAdapter
import com.example.klai.coderswag.Model.Category
import com.example.klai.coderswag.R
import com.example.klai.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        CategoryListView.adapter = adapter
    }



}
