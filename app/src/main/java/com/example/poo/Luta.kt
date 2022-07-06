package com.example.poo

class Luta {

     private lateinit var desafiado: Lutador
    private lateinit var desafiante: Lutador
     private var rounds: Int = 0
    private var aprovada : Boolean = false

    fun marcarLuta(l1: Lutador, l2: Lutador) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            aprovada = true
            desafiado = l1
            desafiante = l2
        } else {
            aprovada = false
        }
    }
    fun lutar(){
        if (aprovada){
            desafiado.apresentar()
            desafiante.apresentar()
            var vencedor = (0..2).random()
            when(vencedor){
                0 ->{println("Empatou")
                    desafiante.empatarLuta()
                    desafiado.empatarLuta()
                }

                1 -> {println("${desafiado.getName()}, Ganhou")
                    desafiado.ganharLuta()
                    desafiante.perderLuta()
                }
                2 -> {println("${desafiante.getName()}, Ganhou")
                    desafiado.perderLuta()
                    desafiante.ganharLuta()
                }
            }
        }else{
            println("Luta nao pode acontecer")
        }

    }


}