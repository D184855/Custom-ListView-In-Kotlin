package com.example.customlistview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val language = arrayOf<String>(
        "HTML",
        "CSS",
        "PHP",
        "Android",
        "Kotlin",
        "Java",
        "Swift",
        "Python"
    )
    val description = arrayOf<String>(
        "HTML Language",
        "CSS Language",
        "PHP Language",
        "Android Language",
        "Kotlin Language",
        "Java Language",
        "Swift Language",
        "Python Language"


        )

    val imageId = arrayOf<Int>(
        R.drawable.html, R.drawable.css, R.drawable.php,
        R.drawable.androidimg, R.drawable.kotlin, R.drawable.androidimg, R.drawable.java, R.drawable.swift, R.drawable.python
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(this, language, description, imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(
                this,
                "Click on item at $itemAtPos its item id $itemIdAtPos",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}