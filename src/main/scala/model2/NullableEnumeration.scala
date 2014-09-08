package model2

class NullableEnumeration extends scala.Enumeration {
  def restore(idx: Int) = idx match {
    case -1 => null
    case _ => apply(idx)
  }
}
