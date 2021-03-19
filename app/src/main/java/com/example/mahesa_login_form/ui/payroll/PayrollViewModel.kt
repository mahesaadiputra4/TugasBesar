package com.example.mahesa_login_form.ui.payroll
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PayrollViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Payroll Fragment"
    }
    val text: LiveData<String> = _text
}