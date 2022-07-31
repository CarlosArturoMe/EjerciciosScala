package ejercicios.readme

import scala.util.Try

/*
###Ejercicio 3:


Utilizando el concepto de funciones de orden superior implementa un método que pueda recibir un String,
ejecutar alguna operación con este String (el consumidor establece el comportamiento) y retornar un String,
en caso de que la ejecución falle se deberá propagar una custom exception llamada HigherOrderFunctionException.
 */

object Ej3 extends App{
  class HigherOrderFunctionException(mensaje: String = None.orNull, causa: Throwable = None.orNull)
    extends Exception("Eror: "+mensaje, causa)

  def metodo(valor: String, funcion: String => String): String = {
    Try(funcion(valor)).getOrElse(throw new HigherOrderFunctionException)
  }

  println(metodo("1", (x=> x.toInt.toString)))
  //println(metodo("noSoyNumero", (x=> x.toInt.toString)))

}
