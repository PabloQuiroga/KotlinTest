import objetos.Mensaje
import javax.swing.JOptionPane

fun main(){ //punto de entrada de la app acotada desde 1.3

    val entrada = JOptionPane.showInputDialog("Indique el año en curso:")
    val m = Mensaje() //simil al new en Java
    m.setAnio(entrada)

    JOptionPane.showMessageDialog(null, m.getMessage())
    JOptionPane.showMessageDialog(null, "Buen Año!")

}