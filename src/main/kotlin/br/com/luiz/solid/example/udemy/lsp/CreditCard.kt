package br.com.luiz.solid.example.udemy.lsp

class CreditCard : NubankCard() {
    override fun validate() {
        // validacao de cartao de credito
        println("Validando Limite !")
        println("Limite ok")
    }
}