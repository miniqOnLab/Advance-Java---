package basic;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class server {

    public static void main(String[] args) throws IOException {

        try {
            ServerSocket ss = new ServerSocket(3000);
            System.out.println("running server on 3000 port");
            
            while (true) {
                Socket s = ss.accept();
                
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String str = dis.readUTF();
                System.out.println("From Client: " + str);
                
                dis.close();
                s.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
