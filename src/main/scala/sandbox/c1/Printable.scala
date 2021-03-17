package sandbox.c1

/**
 * @author rkommineni
 */
trait Printable[A] {
  def format(a: A): String
}

object Printable {
  def format[A](a: A)(implicit p: Printable[A]): String =  p.format(a)

  def print[A](a:A)(implicit p:Printable[A]) : Unit = println(p.format(a))
}
