package com.example.poo

class Aluno:Pessoa1() {
    private var matric: Int = 0
    private var curso: String = ""
    fun cancelarMatric(){

    }
    fun getMatric(): Int {
        return matric
    }
    fun setMatric(m:Int){
       matric = m
    }
    fun getCurso(): String {
        return curso
    }
    fun setCurso(c:String){
        curso = c
    }




}