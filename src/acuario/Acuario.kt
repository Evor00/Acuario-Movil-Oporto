package acuario

import kotlin.math.PI

// Superclase Acuario
open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    open val forma = "rectángulo"

    open val agua: Double
        get() = volumen * 0.9

    init {
        println("Inicializando acuario")
    }

    constructor(numeroDePeces: Int) : this() {
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    open fun imprimirTamaño() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        println("El volumen es: $volumen l El Agua es: $agua l (${String.format("%.1f", agua / volumen * 100)}% lleno)")
    }
}

// Subclase TanqueTorre (cilíndrico)
class TanqueTorre(
    override var alto: Int,
    var diametro: Int
) : Acuario(alto = alto, ancho = diametro, largo = diametro) {

    override var volumen: Int
        get() = ((ancho / 2.0) * (largo / 2.0) * alto * PI / 1000).toInt()
        set(valor) {
            alto = ((valor * 1000) / (PI * (ancho / 2.0) * (largo / 2.0))).toInt()
        }

    override val agua: Double
        get() = volumen * 0.8

    override val forma = "cilindro"

    override fun imprimirTamaño() {
        println(forma)
        println("El Diámetro es: $diametro cm, Alto: $alto cm")
        println("El volumen es: $volumen l El Agua es: $agua l (${String.format("%.1f", agua / volumen * 100)}% lleno)")
    }
}






