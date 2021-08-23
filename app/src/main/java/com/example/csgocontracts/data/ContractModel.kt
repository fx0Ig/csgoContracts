package com.example.csgocontracts.data

data class ContractModel(
    val weaponToCraft : WeaponModel,
    val priceOfContract : Float,
    val weaponList : List<WeaponForContractModel>
) {

}