package com.wordapp.myapplicationwordle2


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

        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val txtName = findViewById<EditText>(R.id.txtName)

        btnPlay.setOnClickListener() {
            Toast.makeText(this, "Hello " + txtName.text, Toast.LENGTH_LONG).show()

            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }


    }
}

