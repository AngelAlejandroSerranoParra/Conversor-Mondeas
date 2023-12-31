package conversor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Selector {
    private JFrame frame;

    public void mostrarMenu() {
        String[] opciones1 = {"Peso Mexicano", "Euro", "Dolar", "PColombiano", "Yuan", "Peso Argentino"};
        String[] opciones2 = {"Dolar", "Euro", "PColombiano", "Yuan", "Peso Argentino", "Peso Mexicano"};

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

            try {
                if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("Dolar")) {
                    Pmexico pmexico = new Pmexico();
                    pmexico.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pmexico.pmad(numero);
                    String resultado = pmexico.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("PColombiano")) {
                    Pmexico pmexico = new Pmexico();
                    pmexico.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pmexico.pmapc(numero);
                    String resultado = pmexico.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("Euro")) {
                    Pmexico pmexico = new Pmexico();
                    pmexico.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pmexico.pmae(numero);
                    String resultado = pmexico.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("Yuan")) {
                    Pmexico pmexico = new Pmexico();
                    pmexico.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pmexico.pmay(numero);
                    String resultado = pmexico.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                }else if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("Peso Argentino")) {
                    Pmexico pmexico = new Pmexico();
                    pmexico.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pmexico.pArg(numero);
                    String resultado = pmexico.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                
                } else if (opcionSeleccionada1.equals("Euro") && opcionSeleccionada2.equals("Dolar")) {
                    Euro euro = new Euro();
                    euro.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    euro.eDolar(numero);
                    String resultado = euro.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Euro") && opcionSeleccionada2.equals("Euro")) {
                    Euro euro = new Euro();
                    euro.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    euro.pEuro(numero);
                    String resultado = euro.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Euro") && opcionSeleccionada2.equals("PColombiano")) {
                    Euro euro = new Euro();
                    euro.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    euro.pColo(numero);
                    String resultado = euro.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Euro") && opcionSeleccionada2.equals("Yuan")) {
                    Euro euro = new Euro();
                    euro.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    euro.pYuan(numero);
                    String resultado = euro.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Euro") && opcionSeleccionada2.equals("Peso Argentino")) {
                    Euro euro = new Euro();
                    euro.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    euro.pArg(numero);
                    String resultado = euro.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Mexicano") && opcionSeleccionada2.equals("Peso Mexicano")) {
                    Pmexico pmexico = new Pmexico();
                    pmexico.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pmexico.pMex(numero);
                    String resultado = pmexico.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Euro") && opcionSeleccionada2.equals("Peso Mexicano")) {
                    Euro euro = new Euro();
                    euro.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    euro.pMex(numero);
                    String resultado = euro.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Dolar") && opcionSeleccionada2.equals("Peso Mexicano")) {
                    Dolar dolar = new Dolar();
                    dolar.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    dolar.pDome(numero);
                    String resultado = dolar.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                }else if (opcionSeleccionada1.equals("Dolar") && opcionSeleccionada2.equals("Euro")) {
                    Dolar dolar = new Dolar();
                    dolar.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    dolar.pDoEu(numero);
                    String resultado = dolar.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Dolar") && opcionSeleccionada2.equals("Dolar")) {
                    Dolar dolar = new Dolar();
                    dolar.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    dolar.pDodo(numero);
                    String resultado = dolar.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Dolar") && opcionSeleccionada2.equals("PColombiano")) {
                    Dolar dolar = new Dolar();
                    dolar.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    dolar.pDoCO(numero);
                    String resultado = dolar.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Dolar") && opcionSeleccionada2.equals("Yuan")) {
                    Dolar dolar = new Dolar();
                    dolar.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    dolar.pDoYu(numero);
                    String resultado = dolar.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Dolar") && opcionSeleccionada2.equals("Peso Argentino")) {
                    Dolar dolar = new Dolar();
                    dolar.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    dolar.pDoAr(numero);
                    String resultado = dolar.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("PColombiano") && opcionSeleccionada2.equals("Dolar")) {
                    Pcolombia pcolombia = new Pcolombia();
                    pcolombia.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pcolombia.pPD(numero);
                    String resultado = pcolombia.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("PColombiano") && opcionSeleccionada2.equals("PColombiano")) {
                    Pcolombia pcolombia = new Pcolombia();
                    pcolombia.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pcolombia.pCC(numero);
                    String resultado = pcolombia.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("PColombiano") && opcionSeleccionada2.equals("Euro")) {
                    Pcolombia pcolombia = new Pcolombia();
                    pcolombia.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pcolombia.pEu(numero);
                    String resultado = pcolombia.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("PColombiano") && opcionSeleccionada2.equals("Yuan")) {
                    Pcolombia pcolombia = new Pcolombia();
                    pcolombia.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pcolombia.pYu(numero);
                    String resultado = pcolombia.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("PColombiano") && opcionSeleccionada2.equals("Peso Argentino")) {
                    Pcolombia pcolombia = new Pcolombia();
                    pcolombia.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pcolombia.pCAr(numero);
                    String resultado = pcolombia.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("PColombiano") && opcionSeleccionada2.equals("Peso Mexicano")) {
                    Pcolombia pcolombia = new Pcolombia();
                    pcolombia.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pcolombia.pCAM(numero);
                    String resultado = pcolombia.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Yuan") && opcionSeleccionada2.equals("Yuan")) {
                    Pyuan pyuan = new Pyuan();
                    pyuan.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pyuan.pYY(numero);
                    String resultado = pyuan.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Yuan") && opcionSeleccionada2.equals("Dolar")) {
                    Pyuan pyuan = new Pyuan();
                    pyuan.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pyuan.pYD(numero);
                    String resultado = pyuan.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Yuan") && opcionSeleccionada2.equals("Euro")) {
                    Pyuan pyuan = new Pyuan();
                    pyuan.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pyuan.pYE(numero);
                    String resultado = pyuan.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Yuan") && opcionSeleccionada2.equals("PColombiano")) {
                    Pyuan pyuan = new Pyuan();
                    pyuan.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pyuan.pYPC(numero);
                    String resultado = pyuan.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Yuan") && opcionSeleccionada2.equals("Peso Argentino")) {
                    Pyuan pyuan = new Pyuan();
                    pyuan.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pyuan.pYPA(numero);
                    String resultado = pyuan.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Yuan") && opcionSeleccionada2.equals("Peso Mexicano")) {
                    Pyuan pyuan = new Pyuan();
                    pyuan.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pyuan.pYMA(numero);
                    String resultado = pyuan.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Argentino") && opcionSeleccionada2.equals("Peso Argentino")) {
                    Pargen pargen = new Pargen();
                    pargen.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pargen.pAA(numero);
                    String resultado = pargen.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Argentino") && opcionSeleccionada2.equals("Dolar")) {
                    Pargen pargen = new Pargen();
                    pargen.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pargen.pAD(numero);
                    String resultado = pargen.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Argentino") && opcionSeleccionada2.equals("Euro")) {
                    Pargen pargen = new Pargen();
                    pargen.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pargen.pAE(numero);
                    String resultado = pargen.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Argentino") && opcionSeleccionada2.equals("PColombiano")) {
                    Pargen pargen = new Pargen();
                    pargen.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pargen.pAPC(numero);
                    String resultado = pargen.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Argentino") && opcionSeleccionada2.equals("Yuan")) {
                    Pargen pargen = new Pargen();
                    pargen.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pargen.pAyu(numero);
                    String resultado = pargen.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else if (opcionSeleccionada1.equals("Peso Argentino") && opcionSeleccionada2.equals("Peso Mexicano")) {
                    Pargen pargen = new Pargen();
                    pargen.operacion();
                    double numero = Double.parseDouble(textoIngresado);
                    pargen.pAMX(numero);
                    String resultado = pargen.getResultado();
                    mostrarVentanaResultado(resultado, opcionSeleccionada2);
                } else {
                    JOptionPane.showMessageDialog(null, "La conversión seleccionada no es válida", "Error", JOptionPane.ERROR_MESSAGE);
                    mostrarMenu(); // Regresar a la ventana de conversión si hay un error
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                mostrarMenu(); // Regresar a la ventana de conversión si hay un error
            }
        }
    }

    private void mostrarVentanaResultado(String resultado, String opcionSeleccionada2) {
        frame = new JFrame("Resultado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelResultado = new JLabel("Resultado: " + resultado);
        JLabel labelOpcion = new JLabel(opcionSeleccionada2);

        JPanel panel = new JPanel();
        panel.add(labelResultado);
        panel.add(labelOpcion);

        JButton nuevaConversionButton = new JButton("Nueva Conversión");
        nuevaConversionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cerrar la ventana actual
                mostrarMenu();
            }
        });
        panel.add(nuevaConversionButton);

        JButton salirButton = new JButton("Salir");
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Salir de la aplicación
            }
        });
        panel.add(salirButton);

        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Selector selector = new Selector();
        selector.mostrarMenu();
    }
}