package principal;

import javax.swing.*;
import java.awt.*;

public class matrizpaneles extends JFrame{
    private JPanel pilinmauser;
    JButton[][] matrizbotones = new JButton[15][15];

    public matrizpaneles(){
        setContentPane(pilinmauser);
        pilinmauser.setLayout(new GridLayout(15,15)/*Layout(15,15)*/);
        for (int x = 0; x<15; x++){
            for (int j = 0; j < 15; j++){
                JButton bntNuevo = new JButton();
                bntNuevo.setText(Integer.toString(x) + Integer.toString(j));
                matrizbotones[x][j] = bntNuevo;
                pilinmauser.add(matrizbotones[x][j]);
            }
        }
    }
}
