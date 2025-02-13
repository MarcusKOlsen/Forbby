
import java.awt.GridBagLayout;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Dance {
    public Dance() {
        final JFrame frame = new JFrame();
        URL url = this.getClass().getResource("cat.gif");
        ImageIcon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        final JPanel panel = new JPanel(new GridBagLayout());



        panel.add(label);


        // Frame initialization
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("final!");
        
        frame.setUndecorated(true);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
