fun main() {
    print("Comprimento: ")
    val length = readln().toDouble()
    print("Largura: ")
    val width = readln().toDouble()
    print("Altura: ")
    val height = readln().toDouble()
    val volume = length * width * height
    println("Volume da caixa: $volume")
}