package com.tata.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.util.Log.d as d1

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    // За уши зайца
    // Несут к барабану.
    // Заяц ворчит:
    // Барабанить не стану!
    // Нет настроения,
    // Нет обстановки,
    // Нет подготовки,
    // Не вижу морковки!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"За уши зайца \n Несут к барабану.")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG,"Заяц ворчит: \n - Барабанить не стану!")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG,"Нет настроения,")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "Нет обстановки,")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG,"Нет подготовки,")
    }

    override fun onRestart() {
        super.onRestart()

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG,"Не вижу морковки!")
    }
}
