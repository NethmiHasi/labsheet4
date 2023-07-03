package labsheet4
import scala.io.StdIn

object q2 {
  def main(args: Array[String]): Unit = {
    println("Enter any number : ")
    val num = StdIn.readInt()
    println(patternMatching(num))

  }

  def patternMatching(num: Int):String = num match {
      case x if num <= 0 => "Negative/Zero is input"
      case x if num % 2 == 0 => "Even number is given"
      case x if num % 2 != 0 => "Odd number is given"
  }

}
