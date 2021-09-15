package com.myshoppal.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.myshoppal.R
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Kak ini kok aneh yah pas saya komenin semua app bisa dijalankan
        // pas saya uncomen app gabisa dijalankan
        // kalau mau liat yang gak di komenin bisa ke login activity

        //btn_login.setOnClickListener {
         //   loginUser()
        //}

        // tv_register.setOnClickListener {
        //
        // val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
        // startActivity(intent)
        // }
    }

    //val pass: EditText = findViewById(R.id.et_password)
    //val mail : EditText = findViewById(R.id.et_email)

    //val password = pass.toString()
    //val email = mail.toString()

    //fun loginUser() {
    //    if ( password == "123456" && email == "aldo") {
    //        showErrorSnackBar("Logging you in :)", false)
    //    } else {
    //        showErrorSnackBar("Who are you >:", true)
    //   }
    //}
}