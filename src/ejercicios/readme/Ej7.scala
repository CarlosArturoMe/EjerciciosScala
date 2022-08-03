package ejercicios.readme
/*
###Ejercicio 7:

Se tiene una lista de nombres y una lista de consulta de nombres. Para cada consulta, se debe determinar cuántas veces
aparece en la lista de nombres.
Por ejemplo, teniendo como entradas:
nombres = [“Brenda”,”Brenda”,”Jorge”,”Anais”] y consulta = [“Jorge”,”Brenda”,”Angelica”]

Se encuentra 1 vez Jorge, 2 veces Brenda y 0 veces Angelica. Se debe retornar una lista con el número de ocurrencias,
por lo que en este caso retornaremos la lista:
resultados = [1,2,0]

Completa la siguiente función:
def consultaNombres (List[String], List[String]): List[Int]
 */
object Ej7 extends App{

  def consultaNombres(nombres:List[String], consultas:List[String]): List[Int] = {
    var resultados:List[Int] = List()
    for(consulta <- consultas){
      var conteo = 0
      for(nombre <- nombres){
        if(consulta == nombre){
          conteo += 1
        }
      }
      resultados = resultados :+ conteo
    }
    resultados
  }
  var nombres = List("Brenda","Jorge","Jorge","Jorge","Anais")
  var consulta = List("Jorge","Brenda","Angelica")
  println(consultaNombres(nombres,consulta))
}
