package ejercicios.readme

import scala.math.{pow, sqrt}

/*
###Ejercicio 9:

Se requiere implementar una función que resuelva una ecuación de segundo grado, se deberán poder calcular cuando se suma
y cuando se resta, recibiendo como argumentos el valor cuadrático, el lineal y el constante.
Se deberá utilizar una función de orden superior.
La expresión if está prohibida en este ejercicio.

x = (-b +/- √(b^2 - 4ac) ) / (2a)

Para obtener los valores de x de la siguiente ecuación: x² - 5x + 6 = 0
Se debe ejecutar algo parecido a lo siguiente:

ecuacionSegundoGrado(x1, 1, -5, 6) => 3.0 (cuando es suma)
ecuacionSegundoGrado(x2, 1, -5, 6) => 2.0 (cuando es resta)
 */
object Ej8 extends App {

  def ecuacionSegundoGrado(operacion:String, a:Int, b:Int, c:Int):Double = {
    var resultado:Double = 0
    operacion match {
      case "x1" => resultado = (-b + sqrt(pow(b,2) - 4 * a *c)) / 2 * a
      case "x2" => resultado = (-b - sqrt(pow(b,2) - 4 * a *c)) / 2 * a
    }
    resultado
  }

  println(ecuacionSegundoGrado("x1",1,-5,6))
  println(ecuacionSegundoGrado("x2",1,-5,6))
}
