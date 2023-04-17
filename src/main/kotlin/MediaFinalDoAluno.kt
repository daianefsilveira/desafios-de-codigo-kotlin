/* Desafio - Faça um programa que receba a média de um aluno e imprima o seguinte:
Caso a média seja < 5 imprima "REP";
Caso a média seja >= 5 e < 7 imprima "REC";
Caso a média seja >7 imprima "APR".
A entrada consiste em vários arquivos de teste, cada um com uma linha, que conterá o valor da média do aluno.
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com a palavra
"Reprovado" caso sua média seja < 5, "Recuperação" caso sua média seja >= 5 e < 7 e "Aprovado" caso a média seja > 7. */

fun main() {
    val media = readln().toDouble()
    val saida = when {
        media < 5 -> "REP"
        media < 7 -> "REC"
        else      -> "APR"
    }
    println(saida)
}