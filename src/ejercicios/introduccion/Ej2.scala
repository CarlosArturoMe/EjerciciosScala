package ejercicios.introduccion
/**
 * 2. Escriba un bucle for para calcular el producto del código Unicode (método toLong) de todas las letras de la cadena.
 * * Por ejemplo, el producto de todas las cadenas en "Hola" es 9415087488L
 */
object Ej2 extends App{
  def producto(str: String): Long = {
    var res:Long = 1
    for (letra <- str){
      res = res * letra.toLong
    }
    res
  }
  val res2 = producto("Hola")
  println(res2)
}
