import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Start {

    public static Font text = new Font("Dialog", Font.PLAIN, 42);

    public Start() {
        final JFrame frame = new JFrame();

        final JLabel label = new JLabel("HI BBYYYYY!");
        label.setFont(text);
        
        final JButton button = new JButton("Click here to get started");

        button.setFont(text);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Pane_One();
            }
        });

        final JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints(); c.gridy = 1;

        panel.add(label);
        panel.add(button, c);


        // Frame initialization
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Home");
        
        frame.setUndecorated(true);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
        new Start();
    }

}