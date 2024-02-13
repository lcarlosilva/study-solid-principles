package br.com.luiz.solid.example.udemy.lsp

abstract class NubankCard : IPaymentInstrument {
    override fun validate() {
        // validacao basica
    }

    override fun collectPayment() {
        println("Pagamento realizado !!!")
    }
}