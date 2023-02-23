package client;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Model {
    private String chattext;
    Socket socket;
// socet
    PrintWriter out;
    // out
    BufferedReader in;
    // in

    public void connect(String ip, int port) {
        try {
            socket = new Socket(ip,port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getStreams() {
        try {
            out = new PrintWriter(client.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Streams ready...");
    }

// sicka text till text area när du trycker på enter

    // sicka server koden till socekt för att kopla upp dig



    //
}
