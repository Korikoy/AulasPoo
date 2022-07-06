package com.example.poo

class Lutador {

    private var nome: String = ""
    private var nacio: String = ""
    private var idade: Int = 0
    private var altura: Double = 0.0
    private var peso: Double = 0.0
    private var vit: Int = 0
    private var derrotas: Int = 0
    private var empates: Int = 0
    private var categ: String = ""

    constructor(
        pessoa: Pessoa
    ){
        setCateg(pessoa.peso)
        altura = pessoa.altura
        nome = pessoa.nome
        nacio = pessoa.nacio
        idade = pessoa.idade
        peso = pessoa.peso
        vit = pessoa.vit
        derrotas = pessoa.derrotas
        empates = pessoa.empates

    }

    private fun setCateg(peso: Double) {
        if( peso < 52.2){
           categ = "Invalida"
        }else if(peso <= 70.3){
            categ = "Leve"
        }else if(peso <= 83.9 ){
            categ = "Medio"
        }else if(peso <= 120.2){
            categ = "Pesado"
        }else{categ = "Invalido"}

    }

    fun apresentar(){
        println("Lutador : $nome")
        println("Origem : $nacio")
        println("$idade anos")
        println("$altura m de altura")
        println("Pesando $peso KG")
        println("Ganhou : $vit")
        println("Perdeu : $derrotas")
        println("Empatou : $empates")


    }
    fun status(){
        println("$nome")
        println("e um peso $categ")
        println("$vit Vitorias")
        println("$derrotas Derrotas")
        println("$empates Empates")


    }
    fun ganharLuta(){
        vit += 1

    }
    fun perderLuta(){
        derrotas += 1

    }
    fun empatarLuta(){
        empates += 1

    }
    fun getCategoria(): String {
        return categ
    }
    fun getName(): String {
        return nome
    }



























}

