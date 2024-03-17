import java.io._
import scala.io.Source

object File2{
  def main(args: Array[String]): Unit = {
    val e = new PrintWriter(new File("Scala1.txt"))
    e.write("Hello, World!")
    e.close()
    val p = Source.fromFile(new File("Scala1.txt"))
    var counter = 0
    for(line<-p.getLines())
    {
      println("No of Words are: " +line.split(" ").length)
      for(str<-line.split(" ")){
        counter+=str.length
      }
      println("No of Characters are:" +counter)
    }

  }
}
