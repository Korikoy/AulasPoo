package com.example.poo

class Conta( private val dono: String, private var numeroConta: Int) {
    protected var tipoConta = ""
    private var saldo = 0.0
    private var status = false



    fun abrirConta(t: String){
        tipoConta = t
        status = true
        if(tipoConta == "CC"){
            saldo += 50.0
        }else if(tipoConta == "CP"){
            saldo += 150.0
        }

    }
    fun fecharConta(){
        if(saldo > 0.0){
            println("Sua conta ainda tem saldo")
        }else if(saldo < 0.0){
            println("Voce tem debitos com o banco")
        }else{
            println("Conta Fechada com sucesso")
       status = false }
    }
    fun deposit(m: Double){
        if(status){
            saldo += m
            println("Deposito feito com sucesso")
        }else{
            println("Precisa abrir uma conta primeiro")
        }
    }
    fun sacar(m: Double){
        if(status && saldo >= m){
            saldo -= m
            println("Saque feito com sucesso")
        }else{
            println("Saldo insuficiente ou conta nao aberta")
        }

    }
    fun pagarMensal(){
       if(tipoConta == "CC" && saldo >= 12.0){
           saldo -= 12.0
       }else if(tipoConta == "CP" && saldo >= 20.0){
           saldo -= 20.0
       }





    }
    fun verSaldo(){
        println("seu saldo e :$saldo")
    }
    fun dadosDaConta(){
        println("Dono da conta : $dono")
        println("Numero da conta : $numeroConta")
        println("Status da conta: $status")
    }










}