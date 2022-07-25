package ejercicios.introduccion
/**
  * 4. Escriba una función llamada minmax (valores: Array [Int]), que devuelve una tupla con de los valores mínimo y máximo en el array
 */
object Ej4 extends App{
  def minmax(valores: Array[Int]): (Int,Int) = {
    var min: Int = 0
    var max: Int = 0
    for (num <- valores) {
      if(num < min){
        min = num
      }
      if(num > max){
        max = num
      }
    }
    (min,max)
  }
  val valores = Array(0,1,1,2,3,5)
  val res3 = minmax(valores)
  println(res3)
}
