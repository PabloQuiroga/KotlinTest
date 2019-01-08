fun main(args: Array<String>){ //punto de entrada de la app

    val mensaje: String = "Hola mundo"
    var anio : String?

    println("Indique el año en curso:")
    anio = readLine()

    var mensaje_completo: String = mensaje +" "+ anio.toString()

    println(mensaje_completo)

}