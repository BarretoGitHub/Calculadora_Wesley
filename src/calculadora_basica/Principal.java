package calculadora_basica;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String flagA, flagB, flagC;
        double n1, n2;
        int operacao;

        flagA = JOptionPane.showInputDialog("Digite um número");
        n1 = Double.parseDouble(flagA);

        do {
            flagB = JOptionPane.showInputDialog("Informe a operacao:\n1-Somar\n2-Subtrair\n3-Dividir\n4-Multiplicar");
            operacao = Integer.parseInt(flagB);
        } while ((operacao < 1 || operacao > 4));

        flagC = JOptionPane.showInputDialog("Digite um número");
        n2 = Double.parseDouble(flagC);
        
        efetuarCalculo(n1, operacao, n2);
    }
    
    private static void efetuarCalculo(double n1, int operacao, double n2) {
        double resultado = 0;
        String flag = "";

        if (operacao == 1) {
            flag = " + ";
            resultado = n1 + n2;
        } else if (operacao == 2) {
            flag = "-";
            resultado = n1 - n2;
        }
        else if (operacao == 3) {
            flag = "/";
            resultado = n1 / n2;
        }
        else if (operacao == 4) {
            flag = "*";
            resultado = n1 * n2;
        }

        JOptionPane.showMessageDialog(null, String.format("%.2f %s %.2f = %.2f", n1, flag, n2, resultado));

    }

}
