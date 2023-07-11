package conversor;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Selector {
    private JFrame frame; // Variable de instancia para la ventana de resultado

    public void mostrarMenu() {
        String[] opciones1 = {"Peso Mexicano", "Euro", "Opción 3"};
        String[] opciones2 = {"Dólar", "Euro", "PColombiano"};

        JComboBox<String> comboBox1 = new JComboBox<>(opciones1);
        JComboBox<String> comboBox2 = new JComboBox<>(opciones2);

        JTextField textField = new JTextField(10);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Texto:"));
        panel.add(textField);
        panel.add(new JLabel("Opción 1:"));
        panel.add(comboBox1);
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
            String textoIngresado = textField.getText();

            System.out.println("Texto ingresado: " + textoIngresado);
            System.out.println("Opción 1 seleccionada: " + opcionSeleccionada1);
            System.out.println("Opción 2 seleccionada: " + opcionSeleccionada2);

            if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("Dólar")) {
                Pmexico pmexico = new Pmexico();
                pmexico.operacion();
                int numero = Integer.parseInt(textoIngresado);
                pmexico.pmad(numero);
                String resultado = pmexico.getResultado();
                mostrarVentanaResultado(resultado);
            }
            if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("PColombiano")) {
                Pmexico pmexico = new Pmexico();
                pmexico.operacion();
                int numero = Integer.parseInt(textoIngresado);
                pmexico.pmapc(numero);
                String resultado = pmexico.getResultado();
                mostrarVentanaResultado(resultado);
            }
            if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("Euro")) {
                Pmexico pmexico = new Pmexico();
                pmexico.operacion();
                int numero = Integer.parseInt(textoIngresado);
                pmexico.pmae(numero);
                String resultado = pmexico.getResultado();
                mostrarVentanaResultado(resultado);
            }
        }
    }

    private void mostrarVentanaResultado(String resultado) {
        
        frame = new JFrame("Resultado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelResultado = new JLabel(resultado);
        frame.getContentPane().add(labelResultado);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
        JButton nuevaConversionButton = new JButton("Nueva Conversión");
        nuevaConversionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cerrar la ventana actual
                mostrarMenu();
            }
        });
        frame.getContentPane().add(nuevaConversionButton);

        JButton salirButton = new JButton("Salir");
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Salir de la aplicación
            }
        });
        frame.getContentPane().add(salirButton);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Selector selector = new Selector();
        selector.mostrarMenu();
    }
}
