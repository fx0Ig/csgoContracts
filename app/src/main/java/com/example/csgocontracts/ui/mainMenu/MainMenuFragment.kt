package com.example.csgocontracts.ui.mainMenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.csgocontracts.R
import com.example.csgocontracts.databinding.ActivityMainBinding
import com.example.csgocontracts.databinding.ContractLayoutBinding
import com.example.csgocontracts.databinding.FragmentMainMenuBinding
import com.example.csgocontracts.ui.conrtact.ContractFragment

class MainMenuFragment : Fragment() {
    private var _binding: FragmentMainMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainMenuBinding.inflate(inflater)
        setUpListener()
        return binding.root
    }

    private fun setUpListener() {
        binding.openContract.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.mainMenuContainer, ContractFragment())
                .addToBackStack("432")
                .commit()
        }


    }

}