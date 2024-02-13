package br.com.luiz.solid.example.ai.lsp

import java.lang.UnsupportedOperationException

/**
 * Aqui está sendo apresentado o princípio da substituicao de liskov (LSP - Liskov Substitution Principle)
 * - O principio da substituicao de Liskov (Barbara Liskov, 1987), estabelece que Objetos de uma Superclasse devem ser substituiveis por Objetos de Subclasses sem quebrar a aplicacao.
 * Em outras palavras, as Subclasses devem ser capazes de estender as Superclasses de tal forma que nao seja necessario alterar o comportamento esperado;
 * */

// ANTES DO LSP
open class BirdBeforeLSP {
    open fun fly() {
        // implementacao do voo
    }
}

class OstrichBeforeLSP : BirdBeforeLSP() {
    override fun fly() {
        throw UnsupportedOperationException("Avestruz nao voa")
    }
}
// ANTES DO LSP
// ----------------------------------------------------
// DEPOIS DO LSP
open class BirdAfterLSP

open class FlyingBirdExample : BirdAfterLSP() {
    open fun fly() {
        // implementacao do voo
    }
}

class EagleExample : FlyingBird() {
    override fun fly() {
        // implementacao do voo para a aguia
    }
}

class OstrichAfterLSP : BirdAfterLSP() {
    // avestruz nao precisa implementar voo
}
// DEPOIS DO LSP

// ---------------------EXEMPLO PRATICO-------------------------------

// Classe base Bird
open class Bird

// Classe FlyingBird que herda de Bird e adiciona a capacidade de voar
open class FlyingBird : Bird() {
    open fun fly() {
        println("This bird flies")
    }
}

// Classe Eagle que é um tipo de FlyingBird
class Eagle : FlyingBird() {
    override fun fly() {
        println("Eagle is flying high")
    }
}

// Classe Ostrich que é um tipo de Bird, mas não voa
class Ostrich : Bird()

// Uso
fun main() {
    val birds = listOf(FlyingBird(), Eagle(), Ostrich())
    birds.forEach { bird ->
        if (bird is FlyingBird) {
            bird.fly()
        } else {
            println("This bird does not fly")
        }
    }
}
// ---------------------EXEMPLO PRATICO-------------------------------