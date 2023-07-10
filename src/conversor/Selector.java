/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.*;

/**
 *
 * @author Alex
 */
public class Selector {
    public void mostrarMenu() {
        String[] opciones1 = {"Opción 1", "Opción 2", "Opción 3"};
        String[] opciones2 = {"Opción 4", "Opción 5", "Opción 6"};

        JComboBox<String> comboBox1 = new JComboBox<>(opciones1);
        JComboBox<String> comboBox2 = new JComboBox<>(opciones2);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Opción 1:"));
        panel.add(comboBox1);
        panel.add(Box.createHorizontalStrut(15)); // Separación horizontal entre los JComboBox
        panel.add(new JLabel("Opción 2:"));
        panel.add(comboBox2);

        int seleccion = JOptionPane.showOptionDialog(
                null,
                panel,
                "Menú",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{},
                null
        );

        if (seleccion != JOptionPane.CLOSED_OPTION) {
            String opcionSeleccionada1 = (String) comboBox1.getSelectedItem();
            String opcionSeleccionada2 = (String) comboBox2.getSelectedItem();

            System.out.println("Opción 1 seleccionada: " + opcionSeleccionada1);
            System.out.println("Opción 2 seleccionada: " + opcionSeleccionada2);
        }
    }
}
