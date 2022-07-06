package com.example.poo


fun main() {
    val p1 = Pessoa("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1)
    val p2 = Pessoa("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3)
    val l1 = Lutador(p1)
    var l2 = Lutador(p2)
//    var L3 = Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1)
//    var L4 = Lutador("DeadCode", "Australia", 28, 1.93, 81.6, 13, 0, 2)
//    var L5 = Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3)
//    var L6 = Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4)

    l1.apanha()

    val UFC01 = Luta()

    UFC01.marcarLuta(l1, l1)
    UFC01.lutar()


}


// var P1 = Pessoa1()
// var P2 = Aluno()
// var P3 = Professor()
// var P4 = Funcionario()
//
// P1.setNome("Pedro")
// P2.setNome("Maria")
// P3.setNome("Claudio")
// P4.setNome("Fabiana")
// println(P1.getNome())
//
// P2.setCurso("Informatica")
// P3.setSalario(2500.75)
// P4.setSetor("Estoque")
//
//
// }
//
//
// // var P1 = Pessoa("Pretty Boy", "França", 31,1.75,68.9,11,2,1)
// // var P2 = Pessoa("Putscript","Brasil",29,1.68,57.8,14,2,3)
// // var L1 = Lutador(P1)
// // var L2 = Lutador(P2)
// // /*var L3 = Lutador("Snapshadow","EUA",35,1.65,80.9,12,2,1 )
// // var L4 = Lutador("DeadCode","Australia",28,1.93,81.6,13,0,2)
// // var L5 = Lutador("Ufocobol","Brasil",37,1.70,119.3,5,4,3)
// // var L6 = Lutador("Nerdaard","EUA",30,1.81,105.7,12,2,4)*/
// //
// // var UFC01 = Luta()
// //
// // UFC01.marcarLuta(L1,L1)
// // UFC01.lutar()
// //
// //
// //