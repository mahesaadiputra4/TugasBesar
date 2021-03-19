package com.example.mahesa_login_form.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "perbaikan side menu dan bottom"
    }
    val text: LiveData<String> = _text
}