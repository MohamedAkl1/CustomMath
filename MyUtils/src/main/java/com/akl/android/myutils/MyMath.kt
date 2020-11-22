package com.akl.android.myutils

import java.lang.IllegalArgumentException

/**
 * Created by Mohamed Akl on 11/22/2020.
 */
class MyMath{
    fun plus(a: Int, b: Int):Int{
        return a+b
    }
    fun minus(a: Int, b: Int):Int{
        return a-b
    }
    fun times(a: Int, b: Int):Int{
        return a*b
    }
    fun div(a: Int, b: Int):Int{
        if (b == 0)
            throw IllegalArgumentException("Div by zero error")
        else
            return a/b
    }

}