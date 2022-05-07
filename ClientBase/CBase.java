package ClientBase;

import java.io.*;
import java.net.*;

public class CBase{
    private String s1,s2;
    private Socket s;
    private BufferedReader brK;
    private BufferedReader br;
    private PrintStream ps;

    public CBase() throws UnknownHostException{
        try{
            s = new Socket("Localhost",7777);
            brK = new BufferedReader(new InputStreamReader(System.in));
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());
        }
        catch(IOException obj){
            System.out.println("Exception occurd "+obj);
        }
    }
    public void Communication()throws IOException{
        try{
            while(!(s1 = brK.readLine()).equals("bye")){
                ps.println(s1);
                s2 = br.readLine();
                System.out.println("Server Says: "+s2);
                System.out.println("Enter message for server: ");
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
