package ejercicios.readme

import ejercicios.readme.Ej6.{Address, Catalog, Product}

/*
###Ejercicio 11:

Implementar la clase llamada Hexadecimal, la cual deberá sobrecargar las operaciones de suma y resta.
Es necesario que el método getStringHexa retorne como String la representación hexadecimal de la operación.

Ejemplo:
A(Hexa) + 11 (decimal) => 1b (Hexa)
5(decimal) + 6 (decimal) => b (Hexa)
5(Hexa) + 6(Hexa) => b (Hexa)
Crea la clase Hexadecimal extendiendo de HexaTrait.

Ejemplo de uso de la clase
    val hexaA = new Hexadecimal(10)
    val hexaB = new Hexadecimal(11)

    assert((hexaA + 4).getStringHexa().equals("e"))
    assert((hexaA - 5).getStringHexa().equals("5"))

    assert((hexaB + hexaA).getStringHexa().equals("15"))
    assert((hexaB - hexaA).getStringHexa().equals("1"))

    assert((6 + 10).getStringHexa().equals("10"))
    assert((20 - 5).getStringHexa().equals("f"))

HINT: Recuerde considerar los siguientes casos
	Decimal	op	Decimal
	Decimal 	op  	Hexadecimal
	Hexadecimal 	op   	Decimal
	Hexadecimal  	op   	Hexadecimal
 */
object Ej11 extends App{

   implicit class Hexadecimal(var numero: Int) {

     def +(sumando: String):Int = {
      var sumand:Int = 0
      try{
        sumand = Integer.parseInt(sumando, 16)
      }catch {
        case e: Exception => {
          println("Exception Occured! : " + e)
          sumand = Integer.parseInt(sumando)
        }
      }
      numero + sumand
    }
    def -(restando:String): Int = {
      var restand:Int = 0
      try{
        restand = Integer.parseInt(restando, 16)
      }catch {
        case e: Exception => {
          println("Exception Occured! : " + e)
          restand = Integer.parseInt(restando)
        }
      }
      numero - restand
    }
    def getStringHexa():String = {
       numero.toHexString
    }
  }

  val hexaA = new Hexadecimal(10)
  val hexaB = new Hexadecimal(11)

  assert((hexaA + "4").getStringHexa().equals("e"))
  println((hexaA + "4").getStringHexa().equals("e"))
  println((hexaA - "5").getStringHexa().equals("5"))
  println((hexaB + hexaA.getStringHexa()).getStringHexa().equals("15"))
  println((hexaB - hexaA.getStringHexa()).getStringHexa().equals("1"))
  println((6 + 10).getStringHexa().equals("10"))
  println((20 - 5).getStringHexa().equals("f"))
}
