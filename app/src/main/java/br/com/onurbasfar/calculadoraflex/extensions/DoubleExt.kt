package br.com.onurbasfar.calculadoraflex.extensions


fun Double.format(digits: Int) = String.format("%.${digits}f", this)