package com.oosca.laboratorio03
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var fiveCentImageView : ImageView
    private lateinit var tenCentImageView: ImageView
    private lateinit var quarterImageView: ImageView
    private  lateinit var dollarImageView: ImageView
    private lateinit var cashTextView: TextView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fiveCentImageView = findViewById(R.id.Five_Cents_ImageView)
        tenCentImageView = findViewById(R.id.Ten_Cents_ImageView)
        quarterImageView = findViewById(R.id.Quater_ImageView)
        dollarImageView = findViewById(R.id.Dollar_ImageView)
        cashTextView = findViewById(R.id.Cash_TextView)

        fiveCentImageView.setOnClickListener{
            cash += 0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$cash"
        }

        tenCentImageView.setOnClickListener{
            cash += 0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$cash"
        }

        quarterImageView.setOnClickListener{
            cash += 0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$cash"
        }

        dollarImageView.setOnClickListener{
            cash += 1.00
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$cash"
        }
    }
}