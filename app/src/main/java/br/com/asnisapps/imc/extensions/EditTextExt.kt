package br.com.asnisapps.imc.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()

fun EditText.valueInt() = this.text.toString().toInt()

fun EditText.valueDouble() = this.text.toString().toDouble()

