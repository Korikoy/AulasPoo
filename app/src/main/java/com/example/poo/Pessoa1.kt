package com.example.poo

open class Pessoa1() {
    private var nome: String = ""
    private var id: Int = 0
    private var sex: String = ""

    fun getNome(): String {
        return nome
    }
    fun setNome(n:String){
        nome = n
    }
    fun getId(): Int {
        return id
    }
    fun setId(i:Int){
        id = i
    }
    fun getSex(): String {
        return sex
    }
    fun setSex(s: String){
        sex = s
    }




    fun fazerAniv(){
        id += 1

    }



}