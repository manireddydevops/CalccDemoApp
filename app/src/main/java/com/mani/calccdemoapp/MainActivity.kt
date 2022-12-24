package com.mani.calccdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvSubmit).setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        // Added Toast Message
        Toast.makeText(this,"Hi",Toast.LENGTH_SHORT).show()
    }
}