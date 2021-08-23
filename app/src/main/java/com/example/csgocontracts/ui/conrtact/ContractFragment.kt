package com.example.csgocontracts.ui.conrtact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.csgocontracts.R
import com.example.csgocontracts.data.ContractModel
import com.example.csgocontracts.data.WeaponForContractModel
import com.example.csgocontracts.data.WeaponModel
import com.example.csgocontracts.databinding.ConsraintLayoutBinding
import com.example.csgocontracts.databinding.ContractLayoutBinding
import com.example.csgocontracts.extensions.toDollars

class ContractFragment : Fragment() {
    private var _binding: ContractLayoutBinding? = null
    private val binding get() = _binding!!
    val contractModel = ContractModel(
        WeaponModel(1, "AWP-Dragon Lore", R.drawable.dragon_lore),
        27000f, listOf(
            WeaponForContractModel(WeaponModel(1, "m4a1s-Knight",R.drawable.knight), 0.6f)
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ContractLayoutBinding.inflate(inflater)
        setUpListener()
        fillViewWithData(contractModel)
        return binding.root
    }

    fun fillViewWithData(model: ContractModel) {
        binding.contractName.text = model.weaponToCraft.name
        binding.contractPicture.setImageResource(contractModel.weaponToCraft.picture)
        binding.priceOfContract.text =
            resources.getString(R.string.craft_price, model.priceOfContract.toDollars())
    }

    fun fillWeaponData(weaponList: List<WeaponForContractModel>) {

    }

    private fun setUpListener() {
        binding.contractPicture.setOnClickListener {
            Toast.makeText(
                requireContext(),
                "Button pressed",
                Toast.LENGTH_LONG
            ).show()
        }

    }


}