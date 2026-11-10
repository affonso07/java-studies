package month01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava {
    private JButton btnClick;
    private JPanel painelPrincipal;
    private JLabel lblMensagem;

    public OlaMundoJava() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Olá Mundo!");


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Olá Mundo Swing");
        frame.setContentPane(new OlaMundoJava().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
