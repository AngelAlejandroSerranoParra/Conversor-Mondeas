/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author Alex
 */
public class Euro {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        // Código para realizar la operación de Pmexico
    }
    
    public void eDolar(int numero) {
        double resultadoCalculado = numero * 1.18; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void pEuro(int numero) {
        double resultadoCalculado = numero * 1; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void pColo(int numero) {
        double resultadoCalculado = numero * 4593.10; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void pYuan(int numero) {
        double resultadoCalculado = numero * 8.03; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void pArg(int numero) {
        double resultadoCalculado = numero * 296.70; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void pMeEuro(int numero) {
        double resultadoCalculado = numero * 18.90; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }}
