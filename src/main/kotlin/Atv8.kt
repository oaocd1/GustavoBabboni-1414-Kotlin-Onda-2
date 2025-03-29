fun main() {
    val romanMap = mapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
    )
    print("diga um numero romano: ")
    val roman = readln().uppercase()
    var result = 0
    var prevValue = 0
    for (char in roman.reversed()) {
        val value = romanMap[char] ?: 0
        if (value < prevValue) {
            result -= value
        } else {
            result += value
        }
        prevValue = value
    }
    println("numero inteiro: $result")
}