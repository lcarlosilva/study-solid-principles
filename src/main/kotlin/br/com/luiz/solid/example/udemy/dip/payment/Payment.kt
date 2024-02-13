package br.com.luiz.solid.example.udemy.dip.payment

import br.com.luiz.solid.example.udemy.dip.factory.DbProductFactory
import br.com.luiz.solid.example.udemy.dip.factory.DbType

class Payment {
    fun pay(productId: String) {
        // val dbProduct = MySQLProduct()
        val dbProduct = DbProductFactory.create(DbType.MYSQL)
        val productById = dbProduct.getProductById(productId)
        println(productById)
    }
}