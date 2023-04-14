package com.oosca.laboratorio04

import android.content.Intent
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.TextView
import com.oosca.laboratorio04.R
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ShareActivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var telTextView: TextView
    private lateinit var actionShareImplicit: Button

    private lateinit var nameText : String
    private lateinit var emailText : String
    private lateinit var telText : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        nameTextView = findViewById(R.id.id_textName_share)
        emailTextView = findViewById(R.id.id_textEmail_share)
        telTextView = findViewById(R.id.id_textPhone_share)
        actionShareImplicit = findViewById(R.id.id_btn_share)

        val nameShared = intent.getStringExtra("name").toString()
        val emailShared = intent.getStringExtra("email").toString()
        val telShared = intent.getStringExtra("tel").toString()

        nameTextView.text = "Nombre: ${nameShared}"
        emailTextView.text = "Correo electrónico: ${emailShared}"
        telTextView.text = "Número de teléfono: ${telShared}"

        nameText = nameTextView.text.toString();
        emailText = emailTextView.text.toString();
        telText = telTextView.text.toString();

        actionShareImplicit.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "$nameText\n$emailText\n$telText," )
                type = "text/plain"
            }

            val shareTitle = "Compartir info"
            val shareIntent = Intent.createChooser(sendIntent, shareTitle)
            startActivity(shareIntent)
        }
    }
}