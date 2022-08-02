package ejercicios.readme
/*
###Ejercicio 6:

Una famosa empresa de desarrollo de software tiene una biblioteca heredada que cuenta con las siguientes definiciones:

case class Catalog(index: Int, value: String)
case class Address(index: Int, street: String, name: String)
case class Product(index: Int, name: String, tax: Double)

Actualmente se encuentran en un conflicto ya que requieren convertir variables de tipo Int a cualquiera de las tres
estructuras antes mencionadas pero no pueden realizar métodos independientes para llevar a cabo sus tareas.
Se requiere hacer el casteo directamente en la instancia Int como si de un método nativo se tratara, similar a un 20.toString

Ejercicio.
Ayuda a la empresa a resolver su problemática implementando una solución que permita hacer lo siguiente:
20.toCatalog() => Catalog(20,)
20.toAddress() => Address(20,,)
20.toProduct() = Product(20,,0.0)
20.toCatalog(value) = Catalog(20,value)
20.toAddress(street, name) => Address(20,street,name)
20.toProduct(name, tax) => Product(20,name,tax)
 */
object Ej6 extends App {

  class Catalog(var id:Int,var nombre:String){
    override def toString() : String = {
      return "[Catalog id : " + id +
        ", nombre: " + nombre +
        "]"
    }
  }

  class Address(var id:Int, var calle:String, var nombre:String){
    override def toString() : String = {
      return "[Address id : " + id +
        ", calle: " + calle +
        ", nombre: " + nombre +
        "]"
    }
  }
  class Product(var id:Int, var nombre:String, var tax:Int){
    override def toString() : String = {
      return "[Product id : " + id +
        ", nombre: " + nombre +
        ", tax: " + tax +
        "]"
    }
  }

  implicit class IntToClass(x: Int) {
    def toCatalog(): Catalog = {
      return new Catalog(x,"")
    }
    def toCatalog(nombre:String): Catalog = {
      return new Catalog(x,nombre)
    }
    def toAddress(): Address = {
      return new Address(x,"","")
    }
    def toAddress(calle:String, nombre:String): Address = {
      return new Address(x,calle,nombre)
    }
    def toProduct(): Product = {
      return new Product(x,"",0)
    }
    def toProduct(nombre:String,tax:Int): Product = {
      return new Product(x,nombre,tax)
    }
  }

  println(5.toCatalog())
  println(5.toAddress())
  println(5.toProduct())
  println(5.toCatalog("Nombre"))
  println(5.toAddress("Calle","Nombre"))
  println(5.toProduct("Nombre",5))
}
