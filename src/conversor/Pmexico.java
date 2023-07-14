/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author Alex
 */
public class Pmexico {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        // Código para realizar la operación de Pmexico
    }

    public void pmad(int numero) {
        double resultadoCalculado = (double) numero / 17;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Hola Mundo Peso (Dividir): " + resultado);
    }

    public void pmapc(int numero) {
        double resultadoCalculado = numero * 243.35;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    
    public void pmae(int numero) {
        double resultadoCalculado = (double) numero / 18.76;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Hola Mundo Peso (Dividir): " + resultado);
    }
    public void pmay(int numero) {
        double resultadoCalculado = numero * 0.43;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    public void parg(int numero) {
        double resultadoCalculado = numero * 15.68;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
     public void pMex(int numero) {
        double resultadoCalculado = numero * 1;
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la multiplicación: " + resultado);
    }
    

}


