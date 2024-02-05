package KenzieHelloWorld;

object KenzieHelloWorld {
  def main(args: Array[String]) = {
    println()

    List("kenzie", "noah", "nyah")
      .map(name => s"Hello, ${name}")
      .foreach(sentence => (1 to 4).foreach(_ => println(sentence)))

    println()
  }
}
