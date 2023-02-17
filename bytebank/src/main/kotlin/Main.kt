fun main() {
    println("Bem vindo ao Bytebank")

    val contaGiovanna = Conta()
    contaGiovanna.titular = "Giovanna"
    contaGiovanna.numero = 1
    contaGiovanna.saldo = 400.0

    println(contaGiovanna.titular)
    println(contaGiovanna.numero)
    println(contaGiovanna.saldo)

    val contaKaiky = Conta()
    contaKaiky.titular = "Kaiky"
    contaKaiky.numero = 2
    contaKaiky.saldo = 300.0

    println("Numero da conta: ${contaKaiky.numero} Titular: ${contaKaiky.titular} Saldo: ${contaKaiky.saldo}")

    println("Depositando na conta do ${contaKaiky.titular}")
    deposita(contaKaiky, 50.0)
    println(contaKaiky.saldo)

    println("Depositando na conta da ${contaGiovanna.titular}")
    contaGiovanna.deposita(contaGiovanna, 1440.0) //
    println(contaGiovanna.saldo)

}



class Conta {
    var titular: String = ""
    var numero: Int = 0
    var saldo: Double = 0.0

    fun deposita(conta: Conta, valor: Double) {
        conta.saldo += valor
    }
}

fun testaCopiasEReferencias() {

    val contaJoao = Conta()
    contaJoao.titular = "Joao"
    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("conta joao ${contaJoao.titular}")
    println("conta maria ${contaMaria.titular}")
}

fun testaLacos() {

    for (i in 1..8) {

        /*var ou val mutavel ou imultavel*/
        val titular: String = "Kaiky $i"
        val numeroConta: Int = 1 + i
        var saldo: Double = i + 10.0

        println("titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        println()

    }

    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        println("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta Positiva")
    } else if (saldo == 0.0) {
        println("Conta é Neutra")
    } else {
        println("Conta é Negativa")
    }
}


