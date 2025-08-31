package acuario

fun construirAcuario() {
    // Acuario rectangular
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamaño()

    // Acuario cilíndrico
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamaño()
}

fun main() {
    construirAcuario()
}









