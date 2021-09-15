package com.myshoppal.ui.activities

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
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

    fun loginUser() {
        if ( et_password.text == "123456" && et_email.text == "aldo") {
            showErrorSnackBar("Logging you in :)", false)
        } else {
            showErrorSnackBar("Who are you >:", true)
        }
    }
}