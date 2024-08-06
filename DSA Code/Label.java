import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

// import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.Color;
import java.awt.Font;


public class Label {
    
    public static void main(String[] args) {
        
        // Jlabel = a GUI display area for a string of text, an image or both
        
        ImageIcon image = new ImageIcon("C:/Users/admin/Downloads/download (1).png");
        Border border = BorderFactory.createLineBorder(Color.red,3);

        JLabel label = new JLabel();
        label.setText("Do you know Kanha ?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text left , center , right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text bottom ,top and center of imageicon
        label.setForeground(new Color(0x00FF00)); // Set font color
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//Set font of text
        label.setIconTextGap(-5);
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // diaplay background color
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0,0,250,250); // Set x and y position within frame as well as dimension

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
