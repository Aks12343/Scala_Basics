import scala.util.control.Breaks._

object Main {
  def main(args: Array[String]): Unit = {
    var b=fun1(24)
    println(b)
    var e=switch("hello")
    println(e)
    var i=0
    while(i<5){
      print(i+" ")
      i=i+1
    }
    println(" ")
    breakable {
      for (i <- 5 to 10) {
        println(i)
        if(i==7)
          break()
      }
    }
    print(fun2(100,2))
  }
  def switch(str: Any):Any=
    str match {
      case 1=>("Hello")
      case "Hello"=>("1")
      case _=>("Enter correct input")
    }
  def fun1(i: Int)= if(i*i==576) -1 else 0
  def fun2(a:Int,b:Int): Int = {
    if(a==1) {
      0
    }
    else
      a+fun2(a,b-1)
  }
}