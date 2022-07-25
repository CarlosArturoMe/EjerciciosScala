package ejercicios.introduccion
/**
 * 3. Escriba una función WordCount para contar el número de palabras en la cadena entrante
 */
object Ej3 extends App{
  def wordcount(str: String): Int = {
    var res: Int = 0
    for (letra <- str) {
      res += 1
    }
    res
  }
  val res3 = wordcount("entrante")
  println(res3)
}
