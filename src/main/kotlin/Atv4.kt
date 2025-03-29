fun main() {
    print("Diga o número inicial: ")
    val start = readln().toInt()
    print("Diga o número final: ")
    val end = readln().toInt()
    val sum = (start..end).filter { it % 2 == 0 }.sum()
    println("Soma dos pares: $sum")
}