import java.net.*;
import java.io.*;

public class TCPClient{
    public static void main(String args[]){
        //Argumentos: Mensaje y nombre del servidor
        Socket s = null;
        try{

            String serverHost = "localhost";
            int serverPort = 7896;

            s = new Socket(serverHost, serverPort);

            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            out.writeUTF("Solicito conversión");

            System.out.println(in.readUTF());

            int opcion = Integer.parseInt(teclado.readLine());
            out.writeInt(opcion);

            System.out.println(in.readUTF());

            double grados = Double.parseDouble(teclado.readLine());
            out.writeDouble(grados);

            System.out.println(in.readUTF());

            s.close();

        }catch(UnknownHostException e){System.out.println("sock:" + e.getMessage());
        }catch(EOFException e){System.out.println("EOF:" + e.getMessage());
        }catch(IOException e){System.out.println("IO:" + e.getMessage());}
    }
}