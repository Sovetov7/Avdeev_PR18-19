package com.example.avdeev_pr18_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class Classification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_classification)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // TODO Auto-generated method stub
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // TODO Auto-generated method stub
        var intent: Intent? = null
        intent = when (item.itemId) {
            R.id.m1 -> Intent(this, GamesHistory::class.java)
            R.id.m2 -> Intent(this, Classification::class.java)
            R.id.m3 -> Intent(this, Components::class.java)
            R.id.m4 -> Intent(this, Development::class.java)
            R.id.m5 -> Intent(this, GamesAsArt::class.java)
            R.id.m6 -> Intent(this, GamesAsLearning::class.java)
            R.id.m7 -> Intent(this, Industry::class.java)
            else -> return super.onOptionsItemSelected(item)
        }
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}