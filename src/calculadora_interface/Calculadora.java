package calculadora_interface;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

    private JButton but0;
    private JButton but1;
    private JButton but2;
    private JButton but3;
    private JButton but4;
    private JButton but5;
    private JButton but6;
    private JButton but7;
    private JButton but8;
    private JButton but9;
    private JButton butIgual;

    private JButton butMais;
    private JButton butMenos;
    private JButton butDiv;
    private JButton butMult;

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    private JTextField field;

    private GridBagLayout layout;
    private GridBagConstraints constraints;

    public Calculadora() {
        super("Calculadora - DSI 2020");
    }

    private void ajustarJanela() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
