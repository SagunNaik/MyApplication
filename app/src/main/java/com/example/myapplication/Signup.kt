package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var nameText=findViewById<EditText>(R.id.nameText)
        var contactText=findViewById<EditText>(R.id.contactText)
        var userName=findViewById<EditText>(R.id.usernameText)
        var password=findViewById<EditText>(R.id.passwordText)
        var cPassword=findViewById<EditText>(R.id.confirmPassText)
        var signupBtn=findViewById<Button>(R.id.signupBtn)
        signupBtn.setOnClickListener {
            var name =nameText.text.toString()
            var contact=contactText.text.toString()
            contact= contact.toBigInteger().toString()
            var userN=userName.text.toString()
            var pass=password.text.toString()
            var cpass=cPassword.text.toString()
            if(name.isNotEmpty()&&(contact.length==10)&&userN.isNotEmpty()&&pass.isNotEmpty()&&cpass.isNotEmpty())
            {
                Log.i("Information","Name: "+name+" \nContact: "+contact+" \nUsername:"+userN+"\nPassword: "+pass+" \nConfirm Password: "+cpass)
                if(pass==cpass)
                {
                    /* ToDo */
                    //Register User in dataBase and return to login Activity
                }
            }
            else{
                Toast.makeText(this,"Check Credentials",Toast.LENGTH_LONG)
            }
        }
    }
}
