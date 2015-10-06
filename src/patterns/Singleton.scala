package patterns

/*
 * There are no statics in Scala. Singletons are represented by an Object
 * Object means Singleton. Class means multiple instances possible
 */
object Singleton {
  def print(msg: String) = println(msg)
}

object SingletonMain {
  def main(args: Array[String]) {
    Singleton.print("Ok")    
  }
}

