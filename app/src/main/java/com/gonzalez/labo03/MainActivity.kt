package com.gonzalez.labo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCents: ImageView
    private lateinit var tenCents: ImageView
    private lateinit var quarterCents: ImageView
    private lateinit var dolarCent: ImageView
    private lateinit var moneyCounter: TextView
    private var moneyCount: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()
        onCLickListeners()

    }

    private fun binding () {
        fiveCents = findViewById(R.id.five_cents)
        tenCents = findViewById(R.id.ten_cents)
        quarterCents = findViewById(R.id.quarter_cent)
        dolarCent = findViewById(R.id.dolar_cent)
        moneyCounter = findViewById(R.id.money_counter)
    }

    private fun onCLickListeners() {
        fiveCents.setOnClickListener {
            moneyCount += 0.05
            val round = (moneyCount * 100).roundToInt() / 100.0
            moneyCounter.text = round.toString()
        }

        tenCents.setOnClickListener {
            moneyCount += 0.10
            val round = (moneyCount * 100).roundToInt() / 100.0
            moneyCounter.text = round.toString()
        }

        quarterCents.setOnClickListener {
            moneyCount += 0.25
            val round = (moneyCount * 100).roundToInt() / 100.0
            moneyCounter.text = round.toString()
        }

        dolarCent.setOnClickListener {
            moneyCount += 1.00
            val round = (moneyCount * 100).roundToInt() / 100.0
            moneyCounter.text = round.toString()
        }
    }
}