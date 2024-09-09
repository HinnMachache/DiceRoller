package com.example.diceroller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
//import kotlin.random.Random as Rd
import java.util.Random


class MainActivity: AppCompatActivity() {

    lateinit var randomDice: ImageView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        randomDice = findViewById(R.id.diceImage)
        // TODO: ViewBinding
        rollButton.setOnClickListener {
            rollDice()
            // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }

    fun rollDice() {
        val randomInt: Int = Random().nextInt(6) + 1
        val diceImageId = when (randomInt) {    // Display Image according to number generated
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        randomDice.setImageResource(diceImageId)

    }
}