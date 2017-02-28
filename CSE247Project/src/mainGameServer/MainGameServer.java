
package mainGameServer;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import tictactoeserver.TicTacToeServer;

public class MainGameServer  extends Thread  {
    //ServerSocket listener = null;
    private static Socket socket;

 public static void main(String[] args) throws Exception {
              ServerSocket listener = new ServerSocket(6789);  
              System.out.println("Server on!");
     try {
     while(true)
        {
        int intChoice=0;

            Socket connectionSocket = listener.accept();
            BufferedReader inFromClient =
            new BufferedReader(new
            InputStreamReader(connectionSocket.getInputStream()));
            intChoice = inFromClient.read();

                //socket = listener.accept();
                //System.out.println("reached");
                //InputStream is = socket.getInputStream();
               // InputStreamReader isr = new InputStreamReader(is);
               // BufferedReader br = new BufferedReader(isr);
                //intChoice = inFromClient.read();
            if(intChoice==1)
            {
                System.out.println("reached");
               TicTacToeServer game = new TicTacToeServer();
               game.callGame(listener);
            }
            if(intChoice==2)
            {
                //Place Holder For rock paper scissors
            }
            else{
                System.out.println("False");
            }
        }
        }finally {
            listener.close();
        }
                //gs.start();      
 }
 }
    
 

