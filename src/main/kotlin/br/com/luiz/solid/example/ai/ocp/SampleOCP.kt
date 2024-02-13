package br.com.luiz.solid.example.ai.ocp

/**
 * Aqui está sendo apresentado o princípio do aberto fechado (OCP - Open Closed Principle)
 * - O principio do aberto fechado, sugere que as entidades de software (Classes, Modulos, Funcoes, etc.) devem estar abertas para extensao, mas fechadas para modificacao.
 * Isso significa que voce deve ser capaz de adicionar novas funcionalidades, sem alterar o codigo existente.
 * As diretrizes desse principio podem ser alcancadas atraves do uso da **ABSTRACAO** e **POLIMORFISMO**;
 * */

// ANTES DO OCP
class RectangleBeforeOCP(val width: Double, val height: Double)

class AreaCalculatorBeforeOCP {
    fun calculatorArea(rectangle: Array<RectangleBeforeOCP>): Double {
        return rectangle.sumOf {
            it.width * it.height
        }
    }
}
// ANTES DO OCP
// ----------------------------------------------------
// DEPOIS DO OCP

class RectangleAfterOCP(private val width: Double, private val height: Double) : Shape {
    override fun area(): Double = width * height
}

class AreaCalculatorAfterOCP {
    fun calculatorArea(shapes: Array<Shape>): Double = shapes.sumOf { it.area() }
}
// DEPOIS DO OCP

// ----------------------------------------------------
// Interface Shape com um método para calcular a área
interface Shape {
    fun area(): Double
}

class Circle(private val radius: Double) : Shape {
    override fun area() = Math.PI * radius * radius
}
// ----------------------------------------------------

// ---------------------EXEMPLO PRATICO-------------------------------

// Implementações concretas da interface Shape
class Rectangle(private val width: Double, private val height: Double) : Shape {
    override fun area() = width * height
}

// Classe que calcula a área total de várias formas
class AreaCalculator {
    fun totalArea(shapes: List<Shape>): Double {
        return shapes.sumOf { it.area() }
    }
}

// Uso
fun main() {
    val shapes = listOf( Rectangle(5.0, 3.0), Circle(2.0) )
    val calculator = AreaCalculator()
    println("Total area: ${calculator.totalArea(shapes)}")
}
// ---------------------EXEMPLO PRATICO-------------------------------