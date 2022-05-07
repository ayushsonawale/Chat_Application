import ClientBase.CBase;
import java.net.*;
import java.io.*;

class Client{
    public static void main(String arg[]) throws UnknownHostException{
        try{
            System.out.println("Client is here..");
            CBase cobj = new CBase();
            cobj.Communication();
        }
        catch(IOException obj){
            System.out.println("Exception occurd "+obj);
        }
    }
}