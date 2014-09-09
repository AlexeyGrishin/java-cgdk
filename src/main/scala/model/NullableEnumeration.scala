package model

class NullableEnumeration extends scala.Enumeration {

  def restoreOpt(idx: Int) = idx match {
    case -1 => None
    case _ => Some(apply(idx))
  }
}
