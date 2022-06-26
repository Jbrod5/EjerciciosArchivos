package principal;

import javax.swing.*;
import java.awt.*;

public class SegundaMatriz extends JFrame{
    private JPanel pilinmauser;
    JButton[][] matrizbotones = new JButton[15][15];
    JPanel[][] matrizpaneles = new JPanel[15][15];

    public SegundaMatriz(){
        setContentPane(pilinmauser);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pilinmauser.setLayout(new GridLayout(15,15)/*Layout(15,15)*/);

        for (int x = 0; x<15; x++){
            for (int j = 0; j < 15; j++){
                JPanel pnlNuevo = new JPanel();
                //JButton bntNuevo = new JButton();

                if(x%2 == 0 ){
                    if(j%2 == 0){
                        pnlNuevo.setBackground(Color.WHITE);
                    }else{
                        pnlNuevo.setBackground(Color.BLACK);
                    }
                }else{
                    if(j%2 == 0){
                        pnlNuevo.setBackground(Color.BLACK);
                    }else{
                        pnlNuevo.setBackground(Color.WHITE);
                    }
                }
                //bntNuevo.setText(Integer.toString(x) + Integer.toString(j));

                matrizpaneles[x][j] = pnlNuevo;
               // matrizbotones[x][j] = bntNuevo;
                pilinmauser.add(matrizpaneles[x][j]);
               // pilinmauser.add(matrizbotones[x][j]);
            }
        }
    }
}
