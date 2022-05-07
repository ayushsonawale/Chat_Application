package ServerBase;

import java.io.*;
import java.net.*;

public class SBase{
    private String s1,s2;
    private ServerSocket ss;
    private Socket s;
    private BufferedReader brK;
    private BufferedReader br;
    private PrintStream ps;


    public SBase() {
        try{
            ss = new ServerSocket(7777);
            System.out.println("Ready to connection...");
            s = ss.accept();

            brK = new BufferedReader(new InputStreamReader(System.in));
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream()); 
        }  
        catch(IOException obj){
            System.out.println("Exception occurd "+obj);
        } 
    }
    public void Communication()throws IOException {
        try{
            while((s1 = br.readLine()) != null){
                System.out.println("Client Says: "+s1);
                System.out.println("Enter message for client: ");
                s2 = brK.readLine();
                ps.println(s2);
            }
        }
        catch(IOException obj){
            System.out.println("Exception occurd "+obj);
        }
        finally{
            ps.close();
            br.close();
            brK.close();
            s.close();
        }
    }
}
