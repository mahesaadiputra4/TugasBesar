package com.example.mahesa_login_form.ui.payroll

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mahesa_login_form.R

class PayrollFragment : Fragment() {

    private lateinit var PayrrollViewModel: PayrollViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        PayrrollViewModel =
                ViewModelProvider(this).get(PayrollViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_payroll, container, false)

        return root
    }
}