package patterns

/*
 * A composite is a composition of objects such that the object 
 * and composition appear the same to client
 */

abstract class File {
  def size(): Int
}

class AtomicFile(name: String, size: Int) extends File {
  def size() = size  
  override def toString() = name
}

class Directory(name: String, list: List[File]) extends File {
  def size() = list.map { x => x.size() }.foldLeft(0)((x, y) => x + y)
  override def toString() = name
}

object CompositeMain {
  def main(args: Array[String]) {
    val files = List(
        new AtomicFile("a.txt", 10),
        new AtomicFile("b.txt", 20),
        new Directory("dir1", List(
            new Directory("subdir1", List(
              new AtomicFile("big.txt", 70)
            )),
            new AtomicFile("ok.txt", 50)
        ))
    )
    
    files.foreach { file => println(file + " " + file.size()) }
  }
}