package com.example.poo

class ControleRemoto:Controlador{

    private var volume : Int = 50
    private var ligado : Boolean = false
    private var tocando: Boolean = false


    override fun ligar() {
        ligado = true
    }

    override fun desligar() {
        ligado = false
    }

    override fun abrirMenu() {
        println(ligado)
        println(volume)
        for ( i in 0..volume step 10){
            println("|")
        }
        println(tocando)
    }

    override fun fecharMenu() {
    }

    override fun maisVolume() {
        if (ligado){
            volume += 1
        }
    }

    override fun menosVolume() {
        if (ligado){
            volume -= 1
        }
    }

    override fun ligarMudo() {
        if (ligado && volume > 0){
            volume = 0
        }
    }

    override fun desligarMudo() {
        if (ligado && volume == 0){
            volume = 50
        }
    }

    override fun play() {
        if (ligado && !tocando ){
            tocando = true
        }
    }

    override fun pause() {
        if (ligado && tocando ){
            tocando = false
        }
    }


}


