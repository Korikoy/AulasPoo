package com.example.poo

class Caneta {
    private var modelo = ""
    private var ponta: Double? = null
    private var tampada: Boolean = false
    private var cor = ""

    constructor(modelo: String,cor: String,ponta: Double?) {
        this.modelo = modelo
        this.cor = cor
        this.ponta = ponta
    }



}