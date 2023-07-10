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


import javax.swing.*;

public class Selector {
    public void mostrarMenu() {
        String[] opciones1 = {"Peso Mexicano", "Euro", "Opción 3"};
        String[] opciones2 = {"Dólar", "Opción 2", "PColombiano"};

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
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[]{"OK"},
                null
        );

        if (seleccion == JOptionPane.OK_OPTION) {
            String opcionSeleccionada1 = (String) comboBox1.getSelectedItem();
            String opcionSeleccionada2 = (String) comboBox2.getSelectedItem();

            System.out.println("Opción 1 seleccionada: " + opcionSeleccionada1);
            System.out.println("Opción 2 seleccionada: " + opcionSeleccionada2);

            if (opcionSeleccionada1.equals("Peso Mexicano") || opcionSeleccionada1.equals("PColombiano")) {
                Pmexico pmexico = new Pmexico();
                pmexico.operacion();
            }
            if (opcionSeleccionada1.equals("Euro")) {
                Euro euro = new Euro();
                euro.operacion();
            }
            if (opcionSeleccionada2.equals("Dólar") || opcionSeleccionada2.equals("Euro")) {
                Dolar dolar = new Dolar();
                dolar.operacion();
            }
            if (opcionSeleccionada2.equals("PColombiano")) {
                PColombiano pcolombiano = new PColombiano();
                pcolombiano.operacion();
            }
        }
    }

    public static void main(String[] args) {
        Selector selector = new Selector();
        selector.mostrarMenu();
    }
}
