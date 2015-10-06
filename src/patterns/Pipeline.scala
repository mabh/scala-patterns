package patterns

/*
 * Chain of responsibility kind of pattern
 * Chain computation in a pipeline fashion. A real life use case could be HTTP request filtering like Spring interceptor does
 */
object Pipeline {
  def main(args: Array[String]) {
    
    //a pipeline of processing
    val pipeline = 
       {(x:String) => x.toInt} andThen {(x:Int) => 5 * x} andThen {x:Int => x.toDouble} andThen {x:Double => Math.sqrt(x)}
       
    val list = List("2345", "21334", "4563", "45346", "6732345", "43636", "7435")

    list.foreach { x => println(pipeline(x)) }
  }
}