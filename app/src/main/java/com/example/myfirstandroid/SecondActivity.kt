package com.example.myfirstandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumnber()
    }

    companion object{
        const val TOTAL_COUNT= "total_count"
    }

    fun showRandomNumnber(){
        var count = intent.getIntExtra(TOTAL_COUNT,0)

        val random = Random()

        var randomInt = 0

        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }

        textview_random.text = Integer.toString(randomInt)
    }
}
