package edu.temple.dicethrow

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random


class MyViewModel : ViewModel() {
    private val dieRoll = MutableLiveData<Int>()
    private var dieSides: Int = 6

    fun rollDice()
    {
        dieRoll.value = Random.nextInt(1,dieSides+1)
    }
    fun getRoll() : LiveData<Int>{
        return dieRoll

    }
    fun setSides(sides: Int){
        dieSides = sides
    }

}