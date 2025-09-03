package acuario

import kotlin.math.PI

open class Acuario(
    open var largo: Int = 100,
    open var ancho: Int = 20,
    open var alto: Int = 40
) {
    // volumen con getter y setter
    open var volumen: Int
        get() = ancho * alto * largo / 1000  // cm³ a litros
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }

    // nueva propiedad open
    open val forma = "rectángulo"

    // nueva propiedad open: agua es el 90% del volumen
    open var agua: Double = 0.0
        get() = volumen * 0.9

    // constructor secundario
    constructor(numeroDePeces: Int) : this() {
        val agua = numeroDePeces * 2000  // cada pez necesita 2000 cm³
        val factor = 1.1  // 10% extra
        alto = (agua * factor / (largo * ancho)).toInt()
    }

    // imprimir detalles
    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        val porcentaje = String.format("%.2f", agua / volumen * 100.0)
        println("Volumen: $volumen l Agua: $agua l ($porcentaje% lleno)")
    }
}

// 🔹 Subclase TanqueTorre
class TanqueTorre(
    override var alto: Int,
    var diametro: Int
) : Acuario(alto = alto, ancho = diametro, largo = diametro) {

    override var volumen: Int
        // fórmula del volumen del cilindro: π * r² * h
        get() = ((ancho / 2.0) * (largo / 2.0) * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / ((ancho / 2.0) * (largo / 2.0))).toInt()
        }

    override var agua: Double = 0.0
        get() = volumen * 0.8

    override val forma = "cilindro"
}
