package com.example.poo

open class Aluno1:Pessoa2() {
    private var matricula: Int = 0
    private lateinit var curso: String

    open fun pagarMensalidade(){
        println("Mensalidade paga")
    }

    fun getMatricula(){

    }
    fun setMatricula(){

    }

    fun getCurso(){

    }
    fun setCurso(){

    }

}