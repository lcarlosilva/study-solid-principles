package br.com.luiz.solid.example.ai.dip

/**
 * Aqui está sendo apresentado o princípio da inversao de dependencia (DIP - Dependency Inversion Principle)
 * - O principio da inversao de dependencia sugere que modulos de alto nivel nao devem depender de modulos de baixo nivel, mas ambos devem depender de abstracoes.
 * Alem disso as abstracoes nao devem depender de detalhes, mas os detalhes devem depender das abstracoes.
 * Isso ajuda a reduzir acoplamentos entre diferentes partes do sistema;
 * */

// ANTES DO DIP
class LightBulbBeforeDIP () {
    fun turnOn() {
        // liga a lampada
    }

    fun turnOff() {
        // desliga a lampada
    }
}
class SwitchBeforeDIP(val bulb: LightBulbBeforeDIP) {
    fun operate() {
        // operacao do interruptor
        bulb.turnOn()
    }
}
// ANTES DO DIP
// ----------------------------------------------------
// DEPOIS DO DIP

class LightBulbAfterDIP : Switchable {
    override fun turnOn() {
        // ligar a lampada
    }

    override fun turnOff() {
        // desligar a lampada
    }
}

class SwitchAfterDIP(private val device: Switchable) {
    fun operate() {
        // operacao do interruptor
        device.turnOn()
    }
}
// DEPOIS DO DIP

// ---------------------EXEMPLO PRATICO-------------------------------

// Interface Switchable para dispositivos que podem ser ligados e desligados
interface Switchable {
    fun turnOn()
    fun turnOff()
}

// Implementação concreta da interface Switchable
class LightBulb : Switchable {
    override fun turnOn() {
        println("LightBulb turned on")
    }

    override fun turnOff() {
        println("LightBulb turned off")
    }
}

// Classe Switch que depende da abstração Switchable, não da implementação concreta
class Switch(private val device: Switchable) {
    fun operate() {
        device.turnOn()
        device.turnOff()
    }
}

// Uso
fun main() {
    val bulb = LightBulb()
    val switch = Switch(bulb)
    switch.operate()
}

// ---------------------EXEMPLO PRATICO-------------------------------