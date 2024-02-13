package br.com.luiz.solid.example.udemy.ocp.vehicles

interface IVehicle {
    fun configureVehicle(color: String, year: String, engine: Double, seats: Int)
    fun starVehicle()
}