package Button;

// import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame implements ActionListener {
    
    JButton button;

    Myframe(){

        ImageIcon icon = new ImageIcon("C:/Users/admin/Downloads/images (1).png");

        button = new JButton();
        button.setBounds(0, 0, 75, 70);
        button.addActionListener(this);
        button.setText("I'm button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setHorizontalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("comic sans",Font.BOLD,25));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Hello");
        }
    }
}
