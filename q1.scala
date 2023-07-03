package labsheet4

import scala.io.StdIn

object q1 {
  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount : ")
    val amount = StdIn.readFloat()

    println ("The total interest for the deposit amount : " +Interest(amount))

  }

  def Interest(amount : Double):Double = amount match {
    case x if x<0 =>0
    case x if x<20000 => x*0.02
    case x if x<200000 => x*0.04
    case x if x<2000000 => x*0.35
    case x if x>=2000000 => x*0.65

  }


}
