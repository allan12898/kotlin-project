package com.example.myfirstandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {

    var array = arrayOf(
        "Melbourne",
        "Vienna",
        "Vancouver",
        "Toronto",
        "Calgary",
        "Adelaide",
        "Perth",
        "Auckland",
        "Helsinki",
        "Hamburg",
        "Munich",
        "New York",
        "Sydney",
        "Paris",
        "Cape Town",
        "Barcelona",
        "London",
        "Bangkok"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val adapter = ArrayAdapter(this,R.layout.listview_item, array)

        val listView: ListView = list_view1

        listView.setAdapter(adapter)

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>, view: View,
                                     position: Int, id: Long) {

                // value of item that is clicked
                val itemValue = listView.getItemAtPosition(position) as String

                // Toast the values
                Toast.makeText(applicationContext,
                    "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                    .show()
            }
        }

        val change_btn = findViewById<Button>(R.id.change)
        change_btn.setOnClickListener {
            // data in the source array has been changed
            array[0] = "New City"
            array[1] = "Another New City"
        }

        val btn_click_me = findViewById<Button>(R.id.refresh)
        btn_click_me.setOnClickListener {
            // let the adapter know that data set has been changed
            // adapter will notify respective views and the views shall refresh

            adapter.notifyDataSetChanged()
        }


    }


}
