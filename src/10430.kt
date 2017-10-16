import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    println((a + b) % c)
    println((a % c + b % c) % c)
    println((a * b) % c)
    println((a % c * b % c) % c)
}