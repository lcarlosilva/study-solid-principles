package br.com.luiz.solid.example.udemy.isp


class Car : IVehicle, IVehicleCar {
    override fun configureCar(color: String, year: String, engine: Double, seats: Int) {
        println("Criando um carro: $color, $year, $engine, $seats")
    }

    override fun startVehicle() {
        println("Ligando os motores! Vruuum....")
    }
}