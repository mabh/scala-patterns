package patterns

/*
 * A command is an object which encapsulates an action
 * Scala does this via apply method. any class can have apply method
 * If the object of that class is used in as a function like addition(1,2) below
 * apply will be called
 */
class Command(name: String, operation: (Int, Int) => Int) {
  def apply(left: Int, right: Int): Int = {
    operation(left, right)
  }
  
  override def toString() = name
}

object CommandMain {
  def main(args: Array[String]) {
    val addition =         new Command("addition", (x, y) => x + y)
    val subtraction =      new Command("subtraction", (x, y) => x - y)
    val multiplication =   new Command("multiplication", (x, y) => x * y)
    val division =         new Command("division", (x, y) => x / y)
    
    println(addition(1, 2))
    println(subtraction(1, 2))
    println(multiplication(1, 2))
    println(division(1, 2))
  }
}