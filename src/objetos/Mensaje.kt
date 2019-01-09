package objetos

import javax.swing.JOptionPane

class Mensaje{ //constructor default

    val mensaje: String = "Hola mundo"
    var anio: Int? = 0

    init { //bloque de inicializacion
        //anio = 0
    }

    fun setAnio(x: String): Unit{
        try {
            this.anio = x.toInt()
        }catch (ex: NumberFormatException){
            //ex.printStackTrace()
            this.anio = 0
            JOptionPane.showMessageDialog(null, "Debe ingresar el año en numeros")
        }
    }
    fun getAnio(): String{
        if(anio == 0){
            return ""
        }else{
            return anio.toString()
        }
    }

    fun getMessage():String{
        return mensaje + " " + getAnio()
    }
}