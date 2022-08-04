package ejercicios.readme

import scala.math.{pow, sqrt}

/*
###Ejercicio 10:

Escribe una función que reciba un número entero y retorne su representación en binario, octal y Hexadecimal,
también es necesario que pueda retornar el valor concatenado de los posibles tres valores.
Notas:
En caso de que no se envíe una de las cuatro posibles opciones(BINARY, OCTAL, HEXADECIMAL, ALL) se deberá lanzar
una excepción de tipo ConvertException
  No hacer uso de if else
  Completa la siguiente función: def convertDecimalTo( convertTo: String, value: Int ) : String
 */
object Ej10 extends App{

  final case class ConvertException(private val message: String = "",
                                   private val cause: Throwable = None.orNull)
    extends Exception(message, cause)

  def convertDecimalTo( convertTo: String, value: Int ) : String = {
    var resultado = ""
    convertTo match {
      case "BINARY" => resultado = (value).toBinaryString
      case "OCTAL" => resultado = (value).toOctalString
      case "HEXADECIMAL" => resultado = (value).toHexString
      case "ALL" => resultado = (value).toBinaryString + (value).toOctalString + (value).toHexString
      case _ => throw ConvertException("ConvertException")
    }
    resultado
  }

  println(convertDecimalTo("BINARY2",5))
}
