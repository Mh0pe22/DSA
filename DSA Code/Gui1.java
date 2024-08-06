import javax.swing.JOptionPane;

public class Gui1 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name);

        String ageString = JOptionPane.showInputDialog("What is your age?");
        int age = Integer.parseInt(ageString);
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
    }
}
