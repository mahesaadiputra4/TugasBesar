package com.example.mahesa_login_form

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.widget.Toolbar
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class MainActivity : AppCompatActivity() {
    var editText1: EditText? = null
    var editText2 : EditText? = null
    var text3 : EditText? = null
    var text4 : EditText? = null
    var text1: String? = null
    var text2 : String? = null

    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text3 = findViewById<View>(R.id.edittext_username) as EditText
        text3!!.setText("mahesa")
        text4 = findViewById<View>(R.id.edittext_password) as EditText
        text4!!.setText("mahesa")




    }


    fun loginMasuk(view: View?) {
        //Method onClick pada Button
        editText1 = findViewById<View>(R.id.edittext_username) as EditText
        editText2 = findViewById<View>(R.id.edittext_password) as EditText



        text1 = editText1!!.getText().toString()
        text2 = editText2!!.getText().toString()



        sendPostRequest(text1!!, text2!!)

        //Kondisi jika username dan password benar maka akan menampilkan pesan text toast
        //Login sukses dan masuk ke activity 2
//        if (text1!!.contains("mahesa") && text2!!.contains("mahesa")) {
//            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this@MainActivity, SecondActivity::class.java)
//            startActivity(intent)
//        } else if (text1!!.contains("") || text2!!.contains("")) /*
//          Atau jika input text 1 dan text 2 kosong
//           */ {
//            //Maka akan menampilkan pesan text toast
//            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show()
//        } else {
//            //jika kedua kondisi diatas tidak memenuhi
//            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show()
//        }
    }




    fun sendPostRequest(userName:String, password:String) {

        var reqParam = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(userName, "UTF-8")
        reqParam += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8")
        val mURL = URL("http://192.168.1.7:5000/api/login")

        with(mURL.openConnection() as HttpURLConnection) {
            // optional default is GET
            requestMethod = "POST"

            val wr = OutputStreamWriter(getOutputStream());
            wr.write(reqParam);
            wr.flush();

            println("URL : $url")
            println("Response Code : $responseCode")

            BufferedReader(InputStreamReader(inputStream)).use {
                val response = StringBuffer()

                var inputLine = it.readLine()
                while (inputLine != null) {
                    response.append(inputLine)
                    inputLine = it.readLine()
                }
                println("Response : $response")
            }
        }
    }
















}