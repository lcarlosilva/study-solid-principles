package br.com.luiz.solid.example.udemy.lsp

class DebitCard : NubankCard() {
    override fun validate() {
        // validando o saldo
        println("Verificando saldo!!!")
        println("Saldo disponível")
    }
}