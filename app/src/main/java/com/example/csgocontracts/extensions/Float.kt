package com.example.csgocontracts.extensions

import java.util.*

fun Float.toDollars(): String {
    return "$ " + String.format(Locale.US, "%.2f", this)
}