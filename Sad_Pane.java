import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sad_Pane {
    public Sad_Pane() {
        final JFrame frame = new JFrame();
        final JLabel label = new JLabel("WAAA WTF :(((((((( NOT VERY NICE!");
        final JButton button_yes = new JButton("Try Again!");

        label.setFont(Start.text);
        button_yes.setFont(Start.text);
        button_yes.setBackground(Color.GREEN);
        button_yes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Pane_One();
            }
            
        });


        final JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints yes = new GridBagConstraints(); yes.gridy = 1;


        panel.add(label);
        panel.add(button_yes, yes);

        // Frame initialization
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("1");
        
        frame.setUndecorated(true);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
