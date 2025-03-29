fun main() {
    print("Diga o salário: ")
    val salary = readln().toDouble()
    print("Diga o percentual de reajuste: ")
    val percent = readln().toDouble()
    val newSalary = salary + (salary * percent / 100)
    println("Novo salário: %.2f".format(newSalary))
}