object Test1 {
  def main(args: Array[String]): Unit = {
    val days = Iterable("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    val aa = days.toVector.sorted.zipWithIndex
      aa.foreach {
      case(day, count) => println(s"$count is $day")
    }
    val bb = Option("messageData").filterNot(_.isEmpty).getOrElse("Unknown Exception")
    println(bb)
    for {
      (srcBaseDir, i) <- days.toVector.sorted.zipWithIndex
    } yield println(s"aaa $srcBaseDir and $i")
  }

  def first(): Unit = {
    println("first")
  }

  def second(): Unit = {
    println("second")
  }

  def third(): Unit = {
    println("third")
  }
}
