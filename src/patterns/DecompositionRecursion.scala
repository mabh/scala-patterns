package patterns

case class Person(name: String, age: Int)

/*
 * Reducing a collection to a single value using Folding operation
 * Reduce operation
 */
object DecompositionRecursion {
  def main(args: Array[String]) {
    val list = List(new Person("jorge", 32), new Person("mariane", 40), new Person("Tim", 12))
    println(
      list.foldLeft("<people>")((accum: String, it: Person) => 
          accum + "<person>" + "<name>" + it.name + "</name>" + "<age>" + it.age + "</age></person>"  
      ) + "</people>"
    )
  }
}