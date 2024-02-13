package br.com.luiz.solid.example.ai.isp

/**
 * Aqui está sendo apresentado o princípio da segregacao de interface (ISP - Interface Segregation Principle)
 * - O principio da segregacao de interface defende que nenhuma classe dever obrigada/forcada a implementar interfaces que nao ira utilizar.
 * Para isso deve ser criadas interfaces especificas e direcionadas, ao inves de uma unica interface generica. Com isso deixando o design mais limpo e a implementacao mais direta;
 * */

// ANTES DO ISP
interface Worker {
    fun work()
    fun eat()
}

class WorkerImplBeforeISP : Worker {
    override fun work() {
        // trabalhando
    }

    override fun eat() {
        // comendo no intervalo
    }
}
// ANTES DO ISP
// ----------------------------------------------------
// DEPOIS DO ISP
interface Workable {
    fun work()
}

interface Eatable {
    fun eat()
}

class WorkerImplAfterISP : Workable, Eatable {
    override fun work() {
        // trabalhando
    }

    override fun eat() {
        // comendo no intervalo
    }
}
// DEPOIS DO ISP

// ---------------------EXEMPLO PRATICO-------------------------------

// Interfaces segregadas
interface Flyable {
    fun fly()
}

interface Walkable {
    fun walk()
}

// Implementações concretas das interfaces
class Bird : Flyable, Walkable, Eatable {
    override fun fly() {
        println("Bird is flying")
    }

    override fun walk() {
        println("Bird is walking")
    }

    override fun eat() {
        println("Bird eats")
    }
}

class Penguin : Walkable, Eatable {
    override fun walk() {
        println("Penguin is walking")
    }

    override fun eat() {
        println("Penguin eats")
    }
}

// Uso
fun main() {
    val bird = Bird()
    bird.fly()
    bird.walk()
    bird.eat()

    val penguin = Penguin()
    penguin.walk()
    penguin.eat()
}

// ---------------------EXEMPLO PRATICO-------------------------------