package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dieViewModel = ViewModelProvider(this)[MyViewModel::class.java]

        dieViewModel.setSides(6)

        if (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainerView, DieFragment())
                .commit()
        }
        if (supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainerView2, DieFragment())
                .commit()
        }


        findViewById<Button>(R.id.rollDiceButton).setOnClickListener {
            dieViewModel.rollDice()
        }
//            supportFragmentManager
//                .findFragmentById(R.id.fragmentContainerView2)?.run{
//                    (this as DieFragment).throwDie()
//                }
//
//
//        }
    }
}