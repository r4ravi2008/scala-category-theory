package sandbox.c1

object PrintableInstances {

  implicit val intPrintable: Printable[Int] = (a: Int) => a.toString

  implicit val stringPrintable: Printable[String] = (a: String) => a

}
