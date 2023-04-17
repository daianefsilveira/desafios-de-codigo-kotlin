object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when {
            (salario in 0.0..1100.0) -> 0.05
            (salario in 1100.0 .. 2500.0) -> 0.10
            else -> 0.15
        }
        return aliquota * salario
    }
}

fun main() {
    val valorSalario = readln().toDouble();
    val valorBeneficios = readln().toDouble();

    val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
    val saida = valorSalario - valorImposto + valorBeneficios;

    println(String.format("%.2f", saida));
}