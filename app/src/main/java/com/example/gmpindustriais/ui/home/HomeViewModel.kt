package com.example.gmpindustriais.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bem vindo a GMP INDUSTRIAIS"
    }
    val text: LiveData<String> = _text
}