package br.com.luiz.solid.example.udemy.lsp

interface IPaymentInstrument {
    @Throws(Exception::class)
    fun validate()
    fun collectPayment()
}