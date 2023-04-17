
# Desafios de Código em Kotlin

Módulo Refinando sua  técnica com desafios de código em Kotlin do Bootcamp TQI Kotlin - Backend Developer.

**Desafio 01 - Média final do Aluno** - [**Código do desafio resolvido**](https://github.com/daianefsilveira/desafios-de-codigo-kotlin/blob/master/src/main/kotlin/MediaFinalDoAluno.kt)</br>
Faça um programa que receba a média de um aluno e imprima o seguinte:</br>
Caso a média seja < 5 imprima "REP";</br>
Caso a média seja >= 5 e < 7 imprima "REC";</br>
Caso a média seja >7 imprima "APR".</br>
***Entrada***</br>
A entrada consiste em vários arquivos de teste, cada um com uma linha, que conterá o valor da média do aluno. Conforme mostrado no exemplo de entrada a seguir.</br>
***Saída***</br>
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com a palavra "Reprovado" caso sua média seja < 5, "Recuperação" caso sua média seja >= 5 e < 7 e "Aprovado" caso a média seja > 7. Use o exemplo abaixo para clarear o que está sendo pedido.
<div><img src="https://user-images.githubusercontent.com/83470427/232614017-2cdcf249-5371-48d0-a1f9-ac814cfdc649.png"></div>

---

**Desafio 02 - Data por Extenso** - [**Código do desafio resolvido**](https://github.com/daianefsilveira/desafios-de-codigo-kotlin/blob/master/src/main/kotlin/DataPorExtenso.kt)</br>
Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.</br>
***Entrada***</br>
As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.</br>
***Saída***</br>
As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.</br>
<div><img src="https://user-images.githubusercontent.com/83470427/232617838-80b33b35-8dfa-444b-9d38-fd35db614f29.png"></div>

---

**Desafio 03 - Numeral Romano** - [**Código do desafio resolvido**](https://github.com/daianefsilveira/desafios-de-codigo-kotlin/blob/master/src/main/kotlin/NumeralRomano.kt)</br>
Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M.</br>
Cada um com seu respectivo valor: I : 1, V : 5, X : 10, L : 50, C : 100, D : 500, M : 1000.</br>  
Eles são geralmente escritos do maior para o menor. Porém, para escrevermos “4” não usamos “IIII”, mas sim “IV” porque 5 - 1 = 4.</br>
***Entrada***</br>
Você receberá uma entrada em numeral romano.</br>
***Saída***</br>
Você deverá imprimir o numeral romano convertido para um número inteiro.</br>
<div><img src="https://user-images.githubusercontent.com/83470427/232618460-e9e51add-f218-4704-a0d5-a49eafcb252d.png"></div>

---

**Desafio 04 - Cálculo Salarial** - [**Código do desafio resolvido**](https://github.com/daianefsilveira/desafios-de-codigo-kotlin/blob/master/src/main/kotlin/CalculoSalarial.kt)</br>
Faça um programa que calcule e imprima o salário a ser transferido para um funcionário. Para realizar o calculo receba o valor bruto do salário e o adicional dos benefícios. O salário a ser transferido é calculado da seguinte maneira:</br>
(valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios</br>
Para calcular o percentual de imposto segue as aliquotas:</br>
De R$ 0.00 a R$ 1100.00 = 5.00%</br>
De R$ 1100.01 a R$ 2500.00 = 10.00%</br>
Maior que R$ 2500.00 = 15.00%</br>
***Entrada***</br>
A entrada consiste em vários arquivos de teste, que conterá o valor bruto do salário e adicional dos benefícios. Conforme mostrado no exemplo de entrada a seguir.</br>
***Saída***</br>
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com um número que será a diferença entre o valor bruto do salário e o percentual de imposto mediante a faixa salárial somado com o adicional dos benefícios. Use o exemplo abaixo para clarear o que está sendo pedido.</br>
<div><img src="https://user-images.githubusercontent.com/83470427/232619812-e2e2e16d-3e8b-4ace-ba45-8eadece98271.png"></div>

---

**Desafio 05 - Taxa de Crescimento** - [**Código do desafio resolvido**](https://github.com/daianefsilveira/desafios-de-codigo-kotlin/blob/master/src/main/kotlin/TaxaDeCrescimento.kt)</br>
Supondo que a população de um país A tenha N habitantes com uma taxa anual de crescimento de 3% e que a população de B M habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.</br>
_Obs: O valor inicial da população A deverá ser sempre menor que do país B._</br>
***Entrada***</br>
A entrada consiste em dois valores inteiros, sendo N a população do país A e M a população do país B.</br>
***Saída***</br>
A saída consiste em retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B, mantidas as taxas de crescimento.</br>
<div><img src="https://user-images.githubusercontent.com/83470427/232620399-43302c1c-2d0e-4bf3-aace-08536ee2d985.png"></div>