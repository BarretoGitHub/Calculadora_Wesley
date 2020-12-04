package calculadora_interface;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

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

    
    private void criarComponentes() {
        layout = new GridBagLayout();
        constraints = new GridBagConstraints();
        this.setLayout(layout);

        panel1 = new JPanel(layout);
        panel2 = new JPanel(layout);
        panel3 = new JPanel(layout);

        Border borda = BorderFactory.createEtchedBorder();
        panel1.setBorder(borda);
        panel2.setBorder(borda);
        panel3.setBorder(borda);

        field = new JTextField(20);

        but0 = new JButton("0");
        but1 = new JButton("1");
        but2 = new JButton("2");
        but3 = new JButton("3");
        but4 = new JButton("4");
        but5 = new JButton("5");
        but6 = new JButton("6");
        but7 = new JButton("7");
        but8 = new JButton("8");
        but9 = new JButton("9");

        butIgual = new JButton("=");
        butMais = new JButton("+");
        butMenos = new JButton("-");
        butDiv = new JButton("/");
        butMult = new JButton("*");
    }
}
