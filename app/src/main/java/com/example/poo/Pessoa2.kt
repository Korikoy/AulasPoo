package com.example.poo

abstract class Pessoa2 {
    private lateinit var nome: String
    private var idade: Int = 0
    private lateinit var sexo: String

  final fun fazerAniver(){
        idade += 1
    }

    fun getNome(): String {
        return nome
    }
    fun setNome(n:String){
        nome = n
    }
    fun getIdade(): Int {
        return idade
    }
    fun setIdade(i:Int){
        idade = i
    }
    fun getSexo(): String {
        return sexo
    }
    fun setSexo(s: String){
        sexo = s
    }



}