data class Pais(var habitantes: Double, var taxaCrescimento: Double) {

    fun crescerPopulacaoAnual() {
        habitantes += habitantes * taxaCrescimento
    }
}

fun main() {
    val habitantesPaisA = readln().toDouble();
    val habitantesPaisB = readln().toDouble();
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 0.03)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 0.015)

    var quantidadeAnos = 0

    while (paisA.habitantes <= paisB.habitantes) {
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()

        quantidadeAnos += 1
    }
    println("$quantidadeAnos anos")
}