package network.src.main.java.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void start() {
        try (ServerSocket socket = new ServerSocket(8080);) {
            System.out.println("Server is running on port 8080");
            while (true){
                try(Socket clientSocket = socket.accept();
                    BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));){
                    PrintStream out = new PrintStream(clientSocket.getOutputStream(), true);

                    String data = br.readLine();
                    System.out.println("Got data form client " + socket.getInetAddress().toString() + " " + data);
                    out.println("Data recieved " + data);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}