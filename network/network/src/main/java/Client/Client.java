package network.src.main.java.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public void start() throws IOException {
        try(Socket socket = new Socket("localhost" , 8080);){
            System.out.println("Client is connected to the server");
            try(BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));){
                PrintWriter out = new PrintWriter(socket.getOutputStream() , true);
                Scanner scanner = new Scanner(System.in);

                System.out.println("Type a message for server");
                String message = scanner.nextLine();
                System.out.println("Message got is " + message);
                out.println(message);

                String messageFromServer  = bis.readLine();
                System.out.println("Message from server is " + messageFromServer);
            }
        }
    }
}
