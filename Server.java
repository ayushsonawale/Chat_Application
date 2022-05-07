import ServerBase.SBase;
import java.io.*;

public class Server {
    public static void main(String arg[])throws IOException {
        System.out.println("this is server..going to start server");
        SBase sobj = new SBase();
        try {
            sobj.Communication();
        } catch (IOException e) {
            System.out.println("Exception occurd "+e);
        }

        sobj = null;
    }
}