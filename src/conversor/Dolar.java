package conversor;

public class Dolar {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        // Código para realizar la operación de Dolar
    }

    public void pDome(double numero) {
        double resultadoCalculado = numero * 16.84;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pDodo(double numero) {
        double resultadoCalculado = numero * 1.0;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pDoCO(double numero) {
        double resultadoCalculado = numero * 4095.50;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pDoYu(double numero) {
        double resultadoCalculado = numero * 7.14;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pDoAr(double numero) {
        double resultadoCalculado = numero * 264.37;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
}
