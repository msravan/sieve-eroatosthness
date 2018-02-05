import collection.mutable.Stack
import org.scalatest._
import sieve.sieveOfErotosthness

class TestSpec extends FlatSpec with Matchers {

  it should "print first five prime numbers after 2" in {
    val sieve = new sieveOfErotosthness
    val primes = sieve.primes
    println(primes.take(100).toList)
    primes.take(5).toList.mkString(",") should be ("2,3,5,7,11")
  }

  it should "print first five natural numbers" in {
    val sieve = new sieveOfErotosthness
    val primes = sieve.nats
    println(primes.take(100).toList)
    primes.take(5).toList.mkString(",") should be ("1,2,3,4,5")
  }
}
