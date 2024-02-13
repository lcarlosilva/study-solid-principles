package br.com.luiz.solid.example.udemy.ocp.vehicles

class Motorcycle(
    override val color: String,
    override val year: String,
    override val engine: Double
) : Vehicle(color, year, engine) {

    fun configureMotorcycle() {
        println("Criando uma moto: ${this.color}, ${this.year}, ${this.engine} - cilindradas")
        startVehicle()
    }
}