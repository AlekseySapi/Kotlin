package ru.alekseysapi.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button -> {
                //Действия при нажатии кнопки
            }
        }
    }
}