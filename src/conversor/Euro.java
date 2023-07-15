package conversor;

public class Euro {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        // Código para realizar la operación de Euro
    }

    public void eDolar(double numero) {
        double resultadoCalculado = numero * 1.18; // Supongamos que 1 Euro equivale a 1.18 Dólares (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pEuro(double numero) {
        double resultadoCalculado = numero * 1; // Supongamos que 1 Euro equivale a 1 Euro (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pColo(double numero) {
        double resultadoCalculado = numero * 4593.10; // Supongamos que 1 Euro equivale a 4593.10 Pesos Colombianos (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pYuan(double numero) {
        double resultadoCalculado = numero * 8.03; // Supongamos que 1 Euro equivale a 8.03 Yuanes (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pArg(double numero) {
        double resultadoCalculado = numero * 296.70; // Supongamos que 1 Euro equivale a 296.70 Pesos Argentinos (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pMex(double numero) {
        double resultadoCalculado = numero * 18.79; // Supongamos que 1 Euro equivale a 1 Peso Mexicano (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
}
