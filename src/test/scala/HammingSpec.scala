import org.scalatest._
import flatspec._
import matchers._
import Hamming._

class HammingSpec extends AnyFlatSpec with should.Matchers {

  "compareDNA()" should "calculate the Hamming Distance between two DNA strands" in {
    compareDNA("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT") shouldBe 7
    compareDNA("GACT", "GACT") shouldBe 0
    compareDNA("CAGT", "TGAC") shouldBe 4

  }

  "compareDNA()" should "throw AssertionError if provided DNA strands of different lengths " in {
     a [AssertionError] should be thrownBy compareDNA("GAGCCTACTAACGGGAT", "GAGCCTACT")
     a [AssertionError] should be thrownBy compareDNA("ACT", "AC")
  }
}