package sieve

class sieveOfErotosthness  {

  def sieve(s: Stream[Int]): Stream[Int] ={
    s.head #:: sieve(s.tail filter(_ % s.head != 0))
  }

  def from(n: Int): Stream[Int] = n #:: from(n+1)

  // Natural numbers
  val nats = from(1)

  def primes : Stream[Int]= sieve(from(2))

}
