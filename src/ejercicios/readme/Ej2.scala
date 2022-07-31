package ejercicios.readme

/*
###Ejercicio 2:

Una hamburguesería famosa tiene un sistema que le permite establecer un ingrediente principal en un producto y
generar N subproductos basados en el primero, por ejemplo:

 Establecer el ingrediente carne para una hamburguesa
  Crear una hamburguesa de carne con queso
  Crear una hamburguesa de carne con cebolla
  Crear una hamburguesa de carne con cebolla, queso y pepinillo
 Establecer el ingrediente champiñón para una hamburguesa
  Crear una hamburguesa de champiñones y queso
  Crear una hamburguesa de champiñones, queso y papas

Ejercicio: Utilizando el concepto de funciones de orden superior implementa un método que dé soporte al flujo
previamente descrito.

Nota: Considera los ingredientes con un tipo de dato String
*/

object Ej2 extends App{
  def ricashamburguesas (principal: String)(otros: String*) = s"Principal: $principal, Otros: ${otros.reduce(_+", "+_)}"

  println(ricashamburguesas("carne")("queso"))
  println(ricashamburguesas("carne")("cebolla"))
  println(ricashamburguesas("carne")("cebolla","queso","pepinillo"))
  println(ricashamburguesas("champiñón")("queso"))
  println(ricashamburguesas("champiñón")("queso","papas"))
}
