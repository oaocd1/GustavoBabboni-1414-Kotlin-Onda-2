fun main() {
    print("Diga o número inicial: ")
    val start = readln().toInt()
    print("Diga o número final: ")
    val end = readln().toInt()
    if (end <= start) {
        println("O número final deve ser maior que o inicial.")
        return
    }
    for (i in start..end) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}