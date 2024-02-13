package br.com.luiz.solid.example.udemy.dip.factory

import br.com.luiz.solid.example.udemy.dip.model.IDbProduct
import br.com.luiz.solid.example.udemy.dip.model.MongoDbProduct
import br.com.luiz.solid.example.udemy.dip.model.MySQLProduct

class DbProductFactory {
    companion object {
        fun create(type: DbType): IDbProduct {
            return when(type) {
                DbType.MYSQL -> MySQLProduct()
                DbType.MONGODB -> MongoDbProduct()
            }
        }
    }
}

enum class DbType {
    MYSQL,
    MONGODB
}