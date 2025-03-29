fun main() {
    print("Informe um nome: ")
    val name = readlnOrNull()?.trim().takeUnless { it.isNullOrEmpty() } ?: "você"
    println("Um para $name, um para mim.")
}