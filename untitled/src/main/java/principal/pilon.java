package principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pilon  extends JFrame{

    private JTabbedPane tabbedPane1;
    private JButton agregarSamierdaButton;
    private JPanel panel1;
    private JButton quitarSamierdaCButton;
    private JButton button1;
    private JPanel ga;

    pilencio pil = new pilencio();
    JPanel lincito = new JPanel();

    public pilon(){
        lincito = pil.getPilencio();

        setSize(500, 500);
        setContentPane(panel1);
        agregarSamierdaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarSamierda();
            }
        });
        quitarSamierdaCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.remove(lincito);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel as = new JLabel();
                as.setText("piljflsadkfjals pil flsadjflak");
                ga.add(as);
                SwingUtilities.updateComponentTreeUI(ga);

            }
        });
    }

    public void agregarSamierda(){
        //tabbedPane1.addTab("samierda", lincito);
        JPanel putencio = pil.getPilencio();
        tabbedPane1.addTab("Samierda de nuevo", putencio);
        tabbedPane1.addTab("Samierda de nuevo", putencio);
        tabbedPane1.addTab("Samierda de nuevo", putencio);
        tabbedPane1.addTab("Samierda de nuevo", putencio);
    }

}
