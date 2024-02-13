package br.com.luiz.solid.example.udemy.lsp

fun main() {
    val creditCard = CreditCard()
    creditCard.validate()
    creditCard.collectPayment()

    println("")

    val debitCard = DebitCard()
    debitCard.validate()
    debitCard.collectPayment()

    println("")

    val rewardsCar = NubankRewards()
    rewardsCar.validate()
    rewardsCar.collectPayment()
}