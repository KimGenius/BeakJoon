import java.util.*

fun main(args: Array<String>) {
    //두 자연수 A와 B가 주어진다.
    //이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를
    //출력하는 프로그램을 작성하시오.
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)
}