package br.com.luiz.solid.example.udemy.dip.model

interface IDbProduct {
    fun getProductById(productId: String) : String
}