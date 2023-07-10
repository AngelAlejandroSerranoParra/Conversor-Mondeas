/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

/**
 *
 * @author Alex
 */
public class Selector {
 public void mostrarMenu() {
 String[] opciones1 = {"Opción 1", "Opción 2", "Opción 3"};
        String[] opciones2 = {"Opción 4", "Opción 5", "Opción 6"};

        JComboBox<String> comboBox = new JComboBox<>(opciones1);
        comboBox.addItem(opciones2[0]);
        comboBox.addItem(opciones2[1]);
        comboBox.addItem(opciones2[2]);

        JOptionPane.showMessageDialog(
            null,
            comboBox,
            "Menú",
            JOptionPane.PLAIN_MESSAGE
        );

        String opcionSeleccionada = (String) comboBox.getSelectedItem();
        System.out.println("Opción seleccionada: " + opcionSeleccionada);
    }
}


