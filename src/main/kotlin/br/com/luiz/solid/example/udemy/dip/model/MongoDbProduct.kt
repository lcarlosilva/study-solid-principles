package br.com.luiz.solid.example.udemy.dip.model

class MongoDbProduct : IDbProduct {
    override fun getProductById(productId: String) : String {
        return "MongoDB: Exibindo dados do Produto $productId"
    }
}