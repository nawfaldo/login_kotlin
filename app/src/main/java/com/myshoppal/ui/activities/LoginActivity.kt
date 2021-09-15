package com.myshoppal.ui.activities

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.myshoppal.R
import kotlinx.android.synthetic.main.activity_login.*
@Suppress("DEPRECATION")
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        btn_login.setOnClickListener {
            loginUser()
        }

        tv_register.setOnClickListener {

            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    val pass: EditText = findViewById(R.id.et_password)
    val mail : EditText = findViewById(R.id.et_email)

    val password = pass.toString()
    val email = mail.toString()

    fun loginUser() {
        if ( password == "123456" && email == "aldo") {
            showErrorSnackBar("Logging you in :)", false)
        } else {
            showErrorSnackBar("Who are you >:", true)
        }
    }
}