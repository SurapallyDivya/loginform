package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginBtn: Button = findViewById(R.id.loginBtn)
        val resetBtn: Button = findViewById(R.id.resetBtn)


        val userName: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.password)

        resetBtn.setOnClickListener {
            userName.setText("")
            password.setText("")
        }

        loginBtn.setOnClickListener {
            val user = userName.text.toString()
            val pass = password.text.toString()
            if (user.equals("divya") && pass.equals("2002"))
            {
                val intent = Intent(this,HomePage::class.java)

                startActivity(intent)

                intent.putExtra("username",user)
                intent.putExtra("password",pass)

                startActivity(intent)
                Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Login Not Successful",Toast.LENGTH_LONG).show()
            }
        }
    }
}


