import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class Frame {
    
    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Vasudev");

        ImageIcon image = new ImageIcon("vasudev.htm");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(50,240,126));
        
    }
}
