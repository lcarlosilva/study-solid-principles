package br.com.luiz.solid.example.udemy.ocp.vehicles

open class Vehicle(
    protected open val color: String,
    protected open val year: String,
    protected open val engine: Double,
) {
    protected fun startVehicle() {
        println("Ligando os motores")
    }
}
