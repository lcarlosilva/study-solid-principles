package br.com.luiz.solid.example.udemy.ocp.vehicles

data class Car(
    private val seats: Int,
    override val color: String,
    override val year: String,
    override val engine: Double
) : Vehicle(color, year, engine) {

    fun configureCar() {
        println("Criando um carro: ${this.color}, ${this.year}, ${this.engine}, ${this.seats}")
        startVehicle()
    }
}