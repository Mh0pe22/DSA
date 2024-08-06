import javax.swing.JOptionPane;

public class JoptionpaneMeassage {
    
    public static void main(String[] args) {
        
        // JOptionPane.showMessageDialog(null, "My name is Mohit", "Name", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "What are ypu creating ?", "Name", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Your systeam has a virus", "Name", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Error 403", "ERROR", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showConfirmDialog(null, "Do you drink coffee ? ", "Ask", JOptionPane.YES_NO_CANCEL_OPTION);
        // JOptionPane.showInputDialog("What is ypur name ? ");

        String[] response = {"I don't know ","May be !","No i am simple human being"};
        JOptionPane.showOptionDialog(null, "You are something out side the world", "Lord", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null,response, 0);
    }
}
