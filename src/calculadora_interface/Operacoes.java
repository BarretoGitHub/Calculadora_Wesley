package calculadora_interface;

public class Operacoes {

    double result;

    public void somar(double v1, double v2) {
        result = v1 + v2;
        System.out.println("Soma: " + result);
    }

    public void subtrair(double v1, double v2) {
        result = v1 - v2;
        System.out.println("Subtração: " + result);

    }

    public void dividir(double v1, double v2) {
        result = v1 / v2;
        System.out.println("Divisao: " + result);

    }

    public void multiplicar(double v1, double v2) {
        result = v1 * v2;
        System.out.println("Multiplicação: " + result);

    }
}
