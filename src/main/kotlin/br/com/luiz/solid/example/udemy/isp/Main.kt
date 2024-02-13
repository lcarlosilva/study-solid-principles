package br.com.luiz.solid.example.udemy.isp

fun main() {

    val type = "Car"

    if (type == "Car") {
        val car = Car()
        car.configureCar("Azul", "2022", 2.6, 4)
    } else {
        val motorcycle = Motorcycle()
        motorcycle.configureMotorcycle("Branca", "2022", 250.0)
    }

}