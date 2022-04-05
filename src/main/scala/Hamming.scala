object Hamming {

  def compareDNA(a: String, b: String): Int = {
    assert(a.length == b.length)

    (a.toUpperCase zip b.toUpperCase).foldLeft(0) { (differences, pair) =>
      pair match {
        case (a, b) if a != b => differences + 1
        case _ => differences
      }
    }
  }
}
