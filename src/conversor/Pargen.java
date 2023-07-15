/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author Alex
 */
public class Pargen {
     private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        // Código para realizar la operación de Pcolombia
    }
    public void pAA(double numero) {
        double resultadoCalculado = numero * 1;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
     public void pAD(double numero) {
        double resultadoCalculado = numero * 0.0038;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pAE(double numero) {
        double resultadoCalculado = numero * 0.0034;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pAPC(double numero) {
        double resultadoCalculado = numero * 15.30;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pAyu(double numero) {
        double resultadoCalculado = numero * 0.027;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pAMX(double numero) {
        double resultadoCalculado = numero * 0.063;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    
}
