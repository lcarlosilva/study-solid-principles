package br.com.luiz.solid.example.udemy.isp

class Motorcycle : IVehicle, IVehicleMotorcycle {
    override fun configureMotorcycle(color: String, year: String, engine: Double) {
        println("Criando um carro: $color, $year, $engine - cilindradas")
    }

    override fun startVehicle() {
        println("Ligando os motores! Vruuum....")
    }
}