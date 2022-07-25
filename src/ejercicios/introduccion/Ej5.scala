package ejercicios.introduccion
/**
 * 5. Escribe una funcion que reciba una lista de objetos de tipo "Persona" y que al iterar la lista imprima a que tipo de persona
 * corresponde, deben de existir al menos estas tres:
 * Alumno(nombre, edad, materias), Profesor(nombre, edad, departamentoId), Oyente(nombre, edad) y Otro (Director, Suplente).
 *
 */
object Ej5 extends App {
  class Persona(nombre: String, edad: Int) {
    def this(nombre: String) = this(nombre,0)
    def name:String = this.getClass.getSimpleName
  }

  class Alumno(nombre: String, edad: Int, materias: String ) extends Persona(nombre)

  class Profesor(nombre: String, edad: Int, departamentoId: Int ) extends Persona(nombre)

  class Oyente(nombre: String, edad: Int) extends Persona(nombre)

  class Otro(nombre: String, Director: String, Suplente: String) extends Persona(nombre)

  def tipoPersona(personas: Array[Persona]): Unit = {
    for (persona <- personas) {
      println(persona.name)
    }
  }

  val jhon = new Alumno("jhon",12,"Español,Matematicas")
  val adolph = new Profesor("adolph",75,1)
  val oleg = new Oyente("oleg",30)
  val sidor = new Otro("sidor","adolph","oleg")

  val personas = Array(jhon,adolph,oleg,sidor)
  tipoPersona(personas)
}
