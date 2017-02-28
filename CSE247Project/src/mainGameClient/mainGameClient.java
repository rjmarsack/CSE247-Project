package mainGameClient;


import TicTacToeClient.TicTacToeClient;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class mainGameClient{

        public static void main(String[] args) throws Exception {
            while(true)
            {
                
               System.out.println("Which game would you like to play?(type the number to decide) :\n"
                       + "1: Tic Tac Toe\n"
                       + "2: Rock Paper Scissors\n"
                       + "3: Exit");
               Scanner scan = new Scanner(System.in);
               int intChoice=scan.nextInt();
               if(intChoice==1){
                                   String serverAddress = (args.length == 0) ? "localhost" : args[1];
                                    while(true)
                                    {
                                        TicTacToeClient client = new TicTacToeClient(serverAddress);
                                        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        client.frame.setSize(240, 160);
                                        client.frame.setVisible(true);
                                        client.frame.setResizable(false);
                                        client.play();
                                        if(!client.wantsToPlayAgain()) {
                                            break;
                                        }
                                    }
        }
               else if(intChoice==2) 
               {
                   System.out.println("This game is not avilable yet sorry! ");
               }
               else if(intChoice==3)
               {
                   break;
               }
               else{
                   System.out.println("please enter a valid number.");
               }
            }
                       
        }

}