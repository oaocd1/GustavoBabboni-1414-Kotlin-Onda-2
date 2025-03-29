fun main() {
    print("Valor da hora-aula: ")
    val hourlyRate = readln().toDouble()
    print("Horas trabalhadas no mês: ")
    val hours = readln().toDouble()
    print("Percentual de desconto do INSS: ")
    val discountPercent = readln().toDouble()
    val grossSalary = hourlyRate * hours
    val discount = grossSalary * discountPercent / 100
    val netSalary = grossSalary - discount
    println("Salário bruto: %.2f".format(grossSalary))
    println("Salário líquido: %.2f".format(netSalary))
}