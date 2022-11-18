package com.example.viewbinding_databinding_example

import androidx.lifecycle.ViewModel

class ViewModel_ViewBinding : ViewModel() {
    private var number = 0

    fun increase() {
        number++
    }

    fun getNumber(): String {
        return number.toString()
    }
}
