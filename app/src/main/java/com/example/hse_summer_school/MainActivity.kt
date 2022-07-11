package com.example.hse_summer_school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.Toast
import com.example.hse_summer_school.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

/** lateinit var binding : AvtivityMainBinding **/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    /**
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = arrayOf("Morty Smith", "Rick Sanchez", "Alan Rails", "When Wolf")

        val userAdapter: ArrayAdapter<String> = ArrayAdapter(
            this,android.R.layout.simple_list_item_1,
            user
        )

        binding.listView.adapter=userAdapter;

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                binding.searchView.clearFocus()
                if (user.contains(p0)) {
                    userAdapter.filter.filter(p0)
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                userAdapter.filter.filter(p0)
                return false
            }

        })
**/
    }
    fun onMortyClick(view : View) {
        val myMorty = Intent(this, MainActivity2::class.java)
        startActivity(myMorty)
    }
    fun onRickClick(view: View) {
        val myRick = Intent(this, MainActivity3::class.java)
        startActivity(myRick)
    }

    fun onAlanClick(view: View) {
        val myAlan = Intent(this, MainActivity4::class.java)
        startActivity(myAlan)
    }

    fun onWhenClick(view: View) {
        val myWhen = Intent(this, MainActivity5::class.java)
        startActivity(myWhen)
    }
}
