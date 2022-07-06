package com.example.poo

class Funcionario: Pessoa1() {

    private var setor: String = ""
    private var trabalhando : Boolean = false
    fun mudarTrabalho(){
        if (trabalhando){trabalhando = false}
        else if (!trabalhando){
            trabalhando = true

    } }
    fun getSetor(): String {
        return setor
    }
    fun setSetor(s:String){
        setor = s
    }
    fun getTrabalhando(): Boolean {
        return trabalhando
    }
    fun setTrabalho(t: Boolean){
        trabalhando = t
    }


}