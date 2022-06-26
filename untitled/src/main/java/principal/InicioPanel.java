package principal;

import javax.swing.*;
import java.awt.*;

public class InicioPanel extends JFrame {

    private JPanel panel;

    public InicioPanel(){
       panel.setLayout(new GridLayout());

        panel.add(new PruebaPanel().PruebaPanelito);
        super.setContentPane(panel);
        super.setSize(500,500);
    }
}
