package acuario

fun construirAcuario() {
    val miAcuario = Acuario()
    miAcuario.imprimirTamano()

    // ALTURA Y LARGO POR DEFECTO
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    // ANCHO POR DEFECTO
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    // TODO PERSONALIZADO
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    // CONSTRUCTOR SECUNDARIO
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario7.imprimirTamano()

    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    // Subclase TanqueTorre
    val miTorre = TanqueTorre(diametro = 25, alto = 45)
    miTorre.imprimirTamano()
}

fun crearPeces(){
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El tiburon es de color ${tiburon.color}")
    tiburon.comer()

    println("El pez payaso es de color ${pezPayaso.color}")
    pezPayaso.comer()

}


fun main() {
    construirAcuario()
    println("--Creando Peces--")
    crearPeces()
}
