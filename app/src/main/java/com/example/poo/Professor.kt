package com.example.poo

class Professor: Pessoa1() {
    private var especi : String = ""
    private var salario: Double = 0.0
    fun receberAument(x:Double){
        salario += x
    }
    fun getEspeci(): String {
        return especi
    }
    fun setEspeci(e:String){
        especi = e
    }
    fun getSalario(): Double {
        return salario
    }
    fun setSalario(s:Double){
        salario = s
    }

}