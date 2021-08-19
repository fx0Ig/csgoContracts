package com.example.csgocontracts.ui

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Filter
import android.widget.Filterable
import android.widget.Toast
import com.example.csgocontracts.R
import com.example.csgocontracts.data.ContractModel
import com.example.csgocontracts.data.WeaponModel
import com.example.csgocontracts.databinding.ActivityMainBinding
import com.example.csgocontracts.databinding.ConsraintLayoutBinding
import com.example.csgocontracts.ui.mainMenu.MainMenuFragment
import java.io.Serializable
import kotlin.contracts.contract


class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainMenuContainer, MainMenuFragment()).commit()
        setContentView(binding.root)


    }

}


