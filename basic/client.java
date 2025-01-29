package basic;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            while (true) { 
            Socket s = new Socket("localhost", 3000);
                
                DataOutputStream dataos = new DataOutputStream(s.getOutputStream());
                Scanner in = new Scanner(System.in);
                System.out.print("Send  Massage:");
                String userinput = in.nextLine();
                dataos.writeUTF(userinput);
                dataos.flush();
                dataos.close();
                s.close();
            }
        } catch (Exception e) {
        }
    }
}
