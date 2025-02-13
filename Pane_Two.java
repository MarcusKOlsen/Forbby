import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pane_Two {
    public Pane_Two(){
        final JFrame frame = new JFrame();
        final JLabel label = new JLabel("Do you wanna.... ");
        final JButton button_yes = new JButton("Yes?");

        label.setFont(Start.text);
        button_yes.setFont(Start.text);
        button_yes.setBackground(Color.GREEN);
        button_yes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Final();
            }
            
        });

        final JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints yes = new GridBagConstraints(); yes.gridy = 1;


        panel.add(label);
        panel.add(button_yes, yes);

        // Frame initialization
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("2");
        
        frame.setUndecorated(true);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
