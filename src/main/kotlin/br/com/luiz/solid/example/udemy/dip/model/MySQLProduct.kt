package br.com.luiz.solid.example.udemy.dip.model

class MySQLProduct : IDbProduct {
    override fun getProductById(productId: String) : String {
        return "Mysql: Exibindo dados do Produto $productId"
    }
}