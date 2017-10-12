import java.util.*

fun main(args: Array<String>) {
    //입력 받은 대로 출력하는 프로그램을 작성하시오.
    val sc = Scanner(System.`in`)
    while (sc.hasNextLine()) {
        val input_text = sc.nextLine()
        if (!(input_text.isEmpty() or (input_text.length > 100))) {
            println(input_text)
        }
    }
}