 package com.akl.android.custommath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akl.android.myutils.MyMath

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = MyMath()
    }
}