package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var firesNum=0.0
    var secondNum=0.0
    var result=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun getNumbers(){
        firesNum=edFirstNum.text.toString().toDouble()
        secondNum=edSecondNum.text.toString().toDouble()
        textView.text=result.toString()

    }
    fun multiply(view: android.view.View) {
        getNumbers()
        result=firesNum*secondNum
        textView.text=result.toString()

    }
    fun divide(view: android.view.View) {
        getNumbers()
        result=firesNum/secondNum
        textView.text=result.toString()

    }
    fun add(view: android.view.View) {
        getNumbers()
        result=firesNum+secondNum
        textView.text=result.toString()

    }
    fun subtract(view: android.view.View) {
        getNumbers()
        result=firesNum-secondNum
        textView.text=result.toString()

    }
}