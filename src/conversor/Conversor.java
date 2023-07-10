/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int codigo = JOptionPane.showConfirmDialog(
            null,
            "Bienvenido al conversor de Monedas, ¿Quieres empezar?",
            "Convertidor de Monedas",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        
    if (codigo == JOptionPane.YES_OPTION) {
            System.out.println("Has pulsado en SI");
            
            Selector selector = new Selector();
            selector.mostrarMenu();
        } else if (codigo == JOptionPane.NO_OPTION) {
            System.out.println("Has pulsado en NO");
        }
    }
}