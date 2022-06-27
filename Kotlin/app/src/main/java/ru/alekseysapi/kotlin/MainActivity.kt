package ru.alekseysapi.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button : Button
    val const1 : Int = 10
    val const2 : String = "Infinity"
    var a = 3
    var b = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button.setOnClickListener(this)

        myFunc()
        //const1 += 1
        //const2 = "Change"
        a = b
        b = const1

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button -> {
                //Действия при нажатии кнопки
            }
        }
    }


}

fun myFunc() {
    //Функция не возвращающая значение
}

fun sum(a : Int, b : Int) : Int {
    return a + b
}

fun multi(a: Int, b: Int) = a * b