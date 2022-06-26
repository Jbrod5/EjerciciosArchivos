package principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pilencio extends JPanel{
    private JPanel pilencio;
    private JButton button1;
    private JButton button2;

    public pilencio(){

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilencio.setBackground(Color.GREEN);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilencio.setBackground(Color.BLACK);
            }
        });
    }

    public JPanel getPilencio() {
        return pilencio;
    }
}
