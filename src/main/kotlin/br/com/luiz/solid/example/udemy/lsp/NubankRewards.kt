package br.com.luiz.solid.example.udemy.lsp

class NubankRewards : IPaymentInstrument{
    override fun validate() {
        // validacoes
        println("Limite Ok, Rewards Ok!")
    }

    override fun collectPayment() {
        println("Pagamento realizado com sucesso !")
        println("Pontuação creditada no Programa Rewards !")
    }
}