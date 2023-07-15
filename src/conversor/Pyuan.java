/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author Alex
 */
public class Pyuan {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        // Código para realizar la operación de Pcolombia
    }
    public void pYY(double numero) {
        double resultadoCalculado = numero * 1.0; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pYD(double numero) {
        double resultadoCalculado = numero * 0.014; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pYE(double numero) {
        double resultadoCalculado = numero * 0.12; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pYPC(double numero) {
        double resultadoCalculado = numero * 567.95; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
     public void pYPA(double numero) {
        double resultadoCalculado = numero * 37.10; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pYMA(double numero) {
        double resultadoCalculado = numero * 2.34; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    
}
