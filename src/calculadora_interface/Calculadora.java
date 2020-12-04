package calculadora_interface;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComponent;
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
    
    private void adicionarComponente(Container panel, JComponent component, int x, int y, int pos, int font, int width, int height, int fill) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.insets = new Insets(4, 4, 4, 4);
        constraints.anchor = pos;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        constraints.fill = fill;

        component.setFont(new Font("arial", font, 12));
        layout.setConstraints(component, constraints);
        panel.add(component);
    }

}
