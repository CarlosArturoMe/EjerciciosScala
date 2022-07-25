package ejercicios.introduccion
/**
 * 1. ¿Cómo obtener el primer y último carácter de la cadena "Hola" en Scala?
 */
object Ej1 extends App{
  def firstlast(str: String): List[Char] = {
    val len = str.length
    List(str.charAt(0), str.charAt(len-1))
  }
  val res1 = firstlast("Hola")
  println(res1)
}
