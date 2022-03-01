fun main(args: Array<String>) {
    //detetive()
    //triangulo()
    //anoBissexto()
      combustivel()



}

fun triangulo(): Unit {
    println("Digite o Primeiro Lado do Triangulo")
    val primeiroLadoDoTriangulo = readLine()!!.toInt()
    println("Digite o Segundo Lado do Triangulo")
    val segundoLadoDoTtiangulo = readLine()!!.toInt()
    println(" Digite o Terceiro Lado do Triangulo")
    val terceiroLadoDoTtiangulo = readLine()!!.toInt()
    if (primeiroLadoDoTriangulo == segundoLadoDoTtiangulo && segundoLadoDoTtiangulo == terceiroLadoDoTtiangulo) {
        println("Triangulo Equilatero")
    } else if (primeiroLadoDoTriangulo == segundoLadoDoTtiangulo && segundoLadoDoTtiangulo != terceiroLadoDoTtiangulo || primeiroLadoDoTriangulo != segundoLadoDoTtiangulo && segundoLadoDoTtiangulo == terceiroLadoDoTtiangulo || primeiroLadoDoTriangulo != terceiroLadoDoTtiangulo && segundoLadoDoTtiangulo == terceiroLadoDoTtiangulo || primeiroLadoDoTriangulo == terceiroLadoDoTtiangulo && segundoLadoDoTtiangulo != terceiroLadoDoTtiangulo
    ) {
        println("Triangulo Isóceles")
    } else if (primeiroLadoDoTriangulo != segundoLadoDoTtiangulo && segundoLadoDoTtiangulo != terceiroLadoDoTtiangulo)
        println("Triangulo Escaleno")
    else {

        println("invalido")


    }

}

fun anoBissexto(): Unit {
    println("Digite o ano:")
    val ano = readLine()!!.toInt()
    if (ano % 4 == 0 && ano % 100 != 0)
        println("É um ano bissexto")
    else if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)
        println("É um ano bissexto")
    else
        println(" Não é um ano bissexto")


}

fun detetive(): Unit {
    println("Responda usando 0 ou 1:\n0 = nao\n1 = sim")
    println("Telefonou para a vitima")
    val pergunta = readLine()!!.toInt()
    if (pergunta == 1)
    else if (pergunta == 0)
    else
        println("Resposta Invalida!!!")


    println("Esteve no local do Crime")
    val pergunta2 = readLine()!!.toInt()
    if (pergunta2 == 1)
    else if (pergunta2 == 0)
    else
        println("Resposta Invalida!!!")


    println("Mora perto da Vitima")
    val pergunta3 = readLine()!!.toInt()
    if (pergunta3 == 1)
    else if (pergunta3 == 0)
    else
        println("Resposta Invalida")

    println("Devia para a Vitima")
    val pergunta4 = readLine()!!.toInt()
    if (pergunta4 == 1)
    else if (pergunta4 == 0)
    else
        println("Resposta Invalida")


    println("Ja trabalhou com a Vitima")
    val pergunta5 = readLine()!!.toInt()
    if (pergunta5 == 1)
    else if (pergunta5 == 0)
    else
        println("Resposta invalida ")

    val media = (pergunta + pergunta2 + pergunta3 + pergunta4 + pergunta5)
    if (media <= 1)
        println("Você é inocente!!!")
    else if (media == 2)
        println("Você é suspeito!!!")
    else if (media <= 4)
        println("Você é Cumplice!!!")
    else if (media == 5)
        println("Você é o Assassino!!!")
    else
        println("Resposta Invalida")


}

 fun  combustivel(): Unit{
     println("Qual Combustivel você vai querer ?\nG - Gasolina\nA - Alcool")
     val tipoDeCombustivel = readLine()!!.toString()

     println("Quantos Litros você vai querer?")
     val litros = readLine()!!.toInt()
     val preco = (litros * 6 )

     if (tipoDeCombustivel.equals("a", true) && litros <= 20 ){
         println("O valor total é R${preco - (preco * 3) / 100}")

     }else if (tipoDeCombustivel.equals("a",true) && litros >= 20){
         println(" O valor total é: R${preco - (preco * 5 ) / 100}")

     }else if (tipoDeCombustivel.equals("g",true) && litros <= 20)
         println("O valor total é: R${preco - (preco * 4 )/ 100}")
     else if (tipoDeCombustivel.equals("g",true) && litros >= 20)
         println("O valor total é: R${preco - (preco * 6 ) / 100}")
     else
         println("Algo deu Errado!!!")

 }








