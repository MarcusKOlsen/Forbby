import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Final {
    public Final(){
        final JFrame frame = new JFrame();
        final JLabel label = new JLabel("BE MY VALENTINE!?");
        final JButton button_yes = new JButton("YEEES!");
        final JButton button_no = new JButton("NO!");

        button_yes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Dance();
            }
            
        });

        button_no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                button_no.setVisible(false);
            }
            
        });


        label.setFont(new Font("Monospaced", Font.BOLD, 73));
        label.setForeground(Color.RED);

        button_yes.setFont(Start.text);
        button_yes.setBackground(Color.GREEN);

        button_no.setFont(Start.text);
        button_no.setBackground(Color.RED);

        final JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints yes = new GridBagConstraints(); yes.gridy = 1;
        GridBagConstraints no = new GridBagConstraints(); no.gridy = 2;


        panel.add(label);
        panel.add(button_yes, yes);
        panel.add(button_no, no);

        // Frame initialization
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("final!");
        
        frame.setUndecorated(true);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
        new Final();
    }
}
