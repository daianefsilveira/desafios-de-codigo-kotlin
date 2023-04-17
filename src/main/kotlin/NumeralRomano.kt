fun main() {
    val numeroRomano: String? = readlnOrNull()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var atual: Int; var proximo: Int
    var resultado = 0

    for (i in numeroRomano!!.indices) {
        atual = numerosRomanos.getValue(numeroRomano[i])
        proximo = when (i + 1) {
            numeroRomano.length -> 0
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }
        resultado += (if (proximo > atual) -1 else 1) * atual
    }
    print(resultado)
}