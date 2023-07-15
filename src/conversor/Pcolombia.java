package conversor;

public class Pcolombia {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        // Código para realizar la operación de Pcolombia
    }

    public void pCC(double numero) {
        double resultadoCalculado = numero * 1.0; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }


    public void pPD(double numero) {
        double resultadoCalculado = numero * 0.0025; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pEu(double numero) {
        double resultadoCalculado = numero * 0.0022; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.2f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pYu(double numero) {
        double resultadoCalculado = numero * 0.0018; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
    public void pCAr(double numero) {
        double resultadoCalculado = numero * 0.065; // Supongamos que 1 Peso Colombiano equivale a 0.025 Dólares (ejemplo)
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
}
