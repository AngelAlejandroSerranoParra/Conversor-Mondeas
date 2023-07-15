package conversor;

public class Pmexico {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void operacion() {
        // Código para realizar la operación de Pmexico
    }

    public void pmad(double numero) {
        double resultadoCalculado = numero / 17;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pmapc(double numero) {
        double resultadoCalculado = numero * 243.35;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pmae(double numero) {
        double resultadoCalculado = numero * 0.053;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pmay(double numero) {
        double resultadoCalculado = numero * 0.43;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pArg(double numero) {
        double resultadoCalculado = numero * 15.68;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }

    public void pMex(double numero) {
        double resultadoCalculado = numero * 1;
        resultado = String.format("%.6f", resultadoCalculado);
        System.out.println("Resultado de la conversión: " + resultado);
    }
}
