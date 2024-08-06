package HowToOpenNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton mybutton = new JButton("New Window");

    LaunchPage(){

        mybutton.setBounds(100, 150, 200, 40);
        mybutton.setFocusCycleRoot(false);
        mybutton.addActionListener(this);

        frame.add(mybutton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == mybutton){

            frame.dispose();
            NewWindow newWindow = new NewWindow();
        }

    }
}
