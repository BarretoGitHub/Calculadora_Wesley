package calculadora_interface;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
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
        criarComponentes();
        ajustarJanela();
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

        adicionarComponente(panel1, field, 0, 0, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but0, 0, 4, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but1, 0, 3, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but2, 1, 3, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but3, 2, 3, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but4, 0, 2, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but5, 1, 2, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but6, 2, 2, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but7, 0, 1, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but8, 1, 1, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, but9, 2, 1, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.NONE);
        adicionarComponente(panel2, butIgual, 1, 4, GridBagConstraints.CENTER, Font.BOLD, 2, 1, GridBagConstraints.HORIZONTAL);

        adicionarComponente(panel3, butMais, 0, 0, GridBagConstraints.CENTER, Font.BOLD, 2, 1, GridBagConstraints.HORIZONTAL);
        adicionarComponente(panel3, butMenos, 0, 1, GridBagConstraints.CENTER, Font.BOLD, 2, 1, GridBagConstraints.HORIZONTAL);
        adicionarComponente(panel3, butDiv, 0, 2, GridBagConstraints.CENTER, Font.BOLD, 2, 1, GridBagConstraints.HORIZONTAL);
        adicionarComponente(panel3, butMult, 0, 3, GridBagConstraints.CENTER, Font.BOLD, 2, 1, GridBagConstraints.HORIZONTAL);

        adicionarComponente(this, panel1, 0, 0, GridBagConstraints.CENTER, Font.BOLD, 2, 1, GridBagConstraints.BOTH);
        adicionarComponente(this, panel2, 0, 1, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.BOTH);
        adicionarComponente(this, panel3, 1, 1, GridBagConstraints.CENTER, Font.BOLD, 1, 1, GridBagConstraints.BOTH);

        but7.addActionListener(e -> field.setText("7"));
        but8.addActionListener(e -> field.setText("8"));
        but9.addActionListener(e -> field.setText("9"));
        but4.addActionListener(e -> field.setText("4"));
        but5.addActionListener(e -> field.setText("5"));
        but6.addActionListener(e -> field.setText("6"));
        but1.addActionListener(e -> field.setText("1"));
        but2.addActionListener(e -> field.setText("0"));
        but3.addActionListener(e -> field.setText("3"));
        but0.addActionListener(e -> field.setText("0"));

        butDiv.addActionListener(e -> field.setText("/"));
        butMult.addActionListener(e -> field.setText("*"));
        butMenos.addActionListener(e -> field.setText("-"));
        butMais.addActionListener(e -> field.setText("+"));

        butIgual.addActionListener(this::ActionListener);
        butDiv.addActionListener(this::ActionListener);
        butMult.addActionListener(this::ActionListener);
        butMenos.addActionListener(this::ActionListener);
        butMais.addActionListener(this::ActionListener);

        but0.addActionListener(this::ActionListener);
        but1.addActionListener(this::ActionListener);
        but2.addActionListener(this::ActionListener);
        but3.addActionListener(this::ActionListener);
        but4.addActionListener(this::ActionListener);
        but5.addActionListener(this::ActionListener);
        but6.addActionListener(this::ActionListener);
        but7.addActionListener(this::ActionListener);
        but8.addActionListener(this::ActionListener);
        but9.addActionListener(this::ActionListener);

    }

    public void ActionListener(ActionEvent e) {
        field.setText("0.0");
        double n1 = Double.parseDouble(field.getText());

        if (e.getSource() == but1) {
        }
        if (e.getSource() == but2) {
        }
        if (e.getSource() == but3) {
        }
        if (e.getSource() == but4) {
        }
        if (e.getSource() == but5) {
        }
        if (e.getSource() == but6) {
        }
        if (e.getSource() == but7) {
        }
        if (e.getSource() == but8) {
        }
        if (e.getSource() == but9) {
        }
        
        
        
        
        
        
        
        if (e.getSource() == butMais) {
        }
        if (e.getSource() == butMenos) {
        }
        if (e.getSource() == butMult) {
        }
        if (e.getSource() == butDiv) {
        }
        if (e.getSource() == butIgual) {
            field.setText("Igual");
        }
    }

}
