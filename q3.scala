package labsheet4

object q3 {

  def main(args: Array[String]): Unit = {
    var name = "Benny"
    println(formatNames(name)(toUpper(_)))

    name = "Niroshan"
    println(formatNames(name){s =>
      val s1 = s.substring(0,2)
      val s2 = s.substring(2)
      toUpper(s1) + toLower(s2)
    })

    name = "Saman"
    println(formatNames(name)(toLower(_)))

    name = "Kumara"
    println(formatNames(name){ s =>
      val s1 = s.substring(0,1)
      val s2 = s.substring(1,5)
      val s3 = s.substring(5)
      toUpper(s1) + toLower(s2) +toUpper(s3)
    })

  }

  def toUpper(str: String) : String = {
    str.toUpperCase()
  }

  def toLower(str: String):String = {
    str.toLowerCase()
  }

  def formatNames(name: String)(func: String => String):String = {
    func(name)
  }

}
