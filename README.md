# sieve-eroatosthness
The sieve Of Eratosthness
It is an ancient algorithm to calculate the prime numbers.
The algorithm is as follows:
1. Start with all the integers starting from 2, the very first prime number.
2. Eliminate all the multiples of 2.
3. The first element of the resulting list is 3, which is the immediate prime number.
4. Eliminate all the multiples of 3.
5. Iterate forever. At each iteration, the first number in the list is a prime number and we eliminate all the multiples of the number.

How do we do this in Scala?

The key idea is to eliminate the multiples, this could be done in Scala using 'filter'
And, lets do this for all the natural numbers.

Lazy evaluation in streams in scala opens gates for the infinite streams.
-
In scala, all the elements of a stream except the first one are computed only when they are needed. This opened the possibility to definite infinite streams.
 Ex: Stream of all integers starting from a given number is simple.

def from(n: Int): Stream[Int] = n #:: from(n+1)

In the above code, from(n+1) is calculated only when needed. <- Lazy evaluation.

We could generate a stream of all the natural numbers:
from(0)

Stream of all multiples of 72: from(1).filter(_ * 72)