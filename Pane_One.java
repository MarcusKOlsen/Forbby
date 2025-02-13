import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pane_One {
    public Pane_One() {
        final JFrame frame = new JFrame();
        final JLabel label = new JLabel("Hi! I, (ur bby), have an important question to ask. I was wondering, could i ask it?");
        final JButton button_yes = new JButton("Yes!");
        final JButton button_no = new JButton("No!");

        label.setFont(Start.text);
        button_yes.setFont(Start.text);
        button_yes.setBackground(Color.GREEN);
        button_yes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Pane_Two();
            }
            
        });

        button_no.setFont(Start.text);        
        button_no.setBackground(Color.RED);
        button_no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Sad_Pane();
            }
            
        });

        final JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints yes = new GridBagConstraints(); yes.gridy = 1;
        GridBagConstraints no = new GridBagConstraints(); no.gridy = 2;

        panel.add(label);
        panel.add(button_yes, yes);
        panel.add(button_no, no);

        // Frame initialization
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("1");
        
        frame.setUndecorated(true);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
    }
}