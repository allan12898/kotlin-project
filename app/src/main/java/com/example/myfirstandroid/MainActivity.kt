package com.example.myfirstandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
//import kotlinx.android.synthetic.main.activity_main.text_view
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMagicBox.create().poke(this)
        //text_view.text = info.text

    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this,findViewById<TextView>(R.id.text_view).text ,Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun countMe(view : View){
        val showCountTextView = findViewById<TextView>(R.id.text_view)
        val countString = showCountTextView.text.toString()

        var count = Integer.parseInt(countString)

        count++

        showCountTextView.text = count.toString()
    }


    fun randomMe(view: View){
        val randomIntent = Intent(this,SecondActivity::class.java)

        var currentCount= text_view.text.toString()

        val count = Integer.parseInt(currentCount)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT,count)
        startActivity(randomIntent)
    }

    fun toListView(view: View){
        val intent = Intent(this, ListviewActivity::class.java)
        startActivity(intent)
    }
    fun toRecyclerView(view: View){
        val intent = Intent(this, RecyclerViewActivity::class.java)
        startActivity(intent)
    }



}

class Info @Inject constructor() {
    val text = "Hello Dagger 2"
}