package ejercicios.readme

import scala.math.{pow, sqrt}

/*
###Ejercicio 8:

Se requiere implementar una función que calcule el peso de una persona dependiendo en qué planeta se encuentre.
Recordando que la fórmula es la siguiente
P = m x g
Donde:
P = peso, m = masa, g = aceleración gravitacional
La aceleración gravitacional varía dependiendo el planeta, se deberá calcular para los siguientes:

Planeta     g
Mercurio    3.70
Tierra      9.81
Saturno     11.67

Utilizando funciones de orden superior obten el peso en cada planeta, solo puedes implementar una sola función
para resolver el problema
def calcularPeso ...

val pesoMercurio = mercurio (70)
val pesoTierra = tierra (70)
val pesoSaturno = saturno (70)
 */
object Ej8 extends App {

  val calcularPeso = (x: Int) => x * 2
  val acel = Map("Mercurio" -> 3.70, "Tierra" -> 9.81, "Saturno" -> 11.67)
  def calcularPeso (peso: Double, masa:Double)(planeta: String) = peso * masa * acel(planeta)

    val pesoMercurio = calcularPeso(5,5)("Mercurio")
    println(pesoMercurio)
  val pesoTierra= calcularPeso(5,5)("Tierra")
  println(pesoTierra)
  val pesoSaturno= calcularPeso(5,5)("Saturno")
  println(pesoSaturno)
}
