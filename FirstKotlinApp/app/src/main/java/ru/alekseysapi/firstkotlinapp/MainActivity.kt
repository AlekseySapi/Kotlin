package ru.alekseysapi.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button : Button
    lateinit var text2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button.setOnClickListener(this)
        text2 = findViewById(R.id.textView2)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button -> {
                text2.setText("Кнопка нажата!")
            }
        }
    }
}