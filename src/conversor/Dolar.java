/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author Alex
 */
public class Dolar {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        
    }
    
    public void pDome(int numero) {
        double resultadoCalculado = numero * 16.84; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void pDodo(int numero) {
        double resultadoCalculado = numero * 1.0; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void pDoCO(int numero) {
        double resultadoCalculado = numero * 4095.50 ;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void pDoYu(int numero) {
        double resultadoCalculado = numero * 7.14 ;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
     public void pDoAr(int numero) {
        double resultadoCalculado = numero * 264.37 ;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    
    
    
}
