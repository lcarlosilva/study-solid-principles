package br.com.luiz.solid.example.udemy.ocp

import br.com.luiz.solid.example.udemy.ocp.vehicles.Car
import br.com.luiz.solid.example.udemy.ocp.vehicles.Motorcycle

enum class TypeVehicle {
    CAR, MOTORCYCLE
}

fun main() {
    val typeVehicle: TypeVehicle = TypeVehicle.CAR

    if (typeVehicle == TypeVehicle.CAR) {
        /* Sem aplicar o OCP
        val vehicle = Vehicle("Amarelo", "2021", 2.0, 4)
        vehicle.car()
        Sem aplicar o OCP */
        val car = Car(4, "Amarelo", "2021", 2.0)
        car.configureCar()
    } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
        /* Sem aplicar o OCP
        val vehicle = Vehicle("Amarelo", "2022", 250.0, 1)
        vehicle.motorcycle()
        Sem aplicar o OCP */
        val motorcycle = Motorcycle("Amarelo", "2022", 250.0)
        motorcycle.configureMotorcycle()
    }
}

/* Sem aplicar o OCP
data class Vehicle(
    private val color: String, private val year: String, private val engine: Double, private val seats: Int
) {
    fun car() {
        println("Criando um carro: ${this.color}, ${this.year}, ${this.engine}, ${this.seats}")
        startVehicle()
    }

    fun motorcycle() {
        println("Criando uma moto: ${this.color}, ${this.year}, ${this.engine} - cilindradas")
        startVehicle()
    }

    private fun startVehicle() {
        println("Ligando os motores")
    }
}
*/
