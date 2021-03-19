//package com.example.mahesa_login_form;
//


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import    androidx.fragment.app.FragmentActivity


//class onclicktoolbar : AppCompatActivity() {
//
//    lateinit var toolbar: ActionBar
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        toolbar = supportActionBar!!
//        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)
//    }
//}


//private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//    when (item.itemId) {
//        R.id.navigation_profile -> {
//            val ProfileFragment = ProfileFragment.newInstance()
//            openFragment(ProfileFragment)
//            return@OnNavigationItemSelectedListener true
//        }
//        R.id.navigation_absensi -> {
//
//            return@OnNavigationItemSelectedListener true
//        }
//        R.id.navigation_lainnya -> {
//
//            return@OnNavigationItemSelectedListener true
//        }
//    }
//    false
//}
//
//private fun openFragment(fragment: Fragment) {
//
//    val fragmentManager = FragmentActivity().supportFragmentManager
//    val transaction = fragmentManager.beginTransaction()
//    transaction.replace(R.id.container, fragment)
//    transaction.addToBackStack(null)
//    transaction.commit()
//

//}


//
//
//
//class MainActivity : AppCompatActivity() {
//
//    lateinit var toolbar: ActionBar
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        toolbar = supportActionBar!!
//        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)
//    }
//}

//package com.example.mahesa_login_form
//
//
//import android.content.Intent
//import android.os.Bundle
//import android.view.View
//import android.widget.EditText
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//
//
//class MainActivity : AppCompatActivity() {
//    var editText1: EditText? = null
//    var editText2 //Deklarasi object dari class EdiText
//            : EditText? = null
//    var text1: String? = null
//    var text2 //Deklarasi object string
//            : String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        supportActionBar!!.title = "User Login Sederhana"
//        supportActionBar!!.subtitle = "okedroid.com"
//    }
//
//    fun loginMasuk(view: View?) {
//        //Method onClick pada Button
//        editText1 = findViewById<View>(R.id.edittext_username) as EditText
//        editText2 = findViewById<View>(R.id.edittext_password) as EditText
//        text1 = editText1!!.text.toString()
//        text2 = editText2!!.text.toString()
//
//        //Kondisi jika username dan password benar maka akan menampilkan pesan text toast
//        //Login sukses dan masuk ke activity 2
//        if (text1!!.contains("Username") && text2!!.contains("Password")) {
//            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this@MainActivity, SecondActivity::class.java)
//            startActivity(intent)
//        } else if (text1!!.matches("") || text2!!.matches("")) /*
//          Atau jika input text 1 dan text 2 kosong
//           */ {
//            //Maka akan menampilkan pesan text toast
//            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show()
//        } else {
//            //jika kedua kondisi diatas tidak memenuhi
//            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show()
//        }
//    }
//}