package player;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        Scanner scanner  = new Scanner(System.in);

        File file = new File("mikasa.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); 
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            
                System.err.println("P = Play S = Stop R = Resume Q = Quit");
                System.out.println("Enter your choice : ");

                response = scanner.next();
                response = response.toUpperCase();

                switch (response) {
                    case "P": clip.start();
                        break;

                    case "S": clip.stop();
                        break;

                    case "R": clip.setMicrosecondPosition(0);
                        break;

                    case "Q": clip.close();
                        break;

                    default:System.out.println("You enter invalid input");
                        break;
                }
                scanner.close();
        }
    }
}
