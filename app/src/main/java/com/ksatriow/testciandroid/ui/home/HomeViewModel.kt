package com.ksatriow.testciandroid.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    val clicks = MutableLiveData<Int>()

    init {
        clicks.value = 0
    }


    fun adding(value: Int) {
        clicks.value = clicks.value?.plus(1)
    }

    fun minus(value: Int) {
        clicks.value = clicks.value?.minus(1)
    }

}