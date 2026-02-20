import java.net.*;
import java.io.*;

public class TCPServer{
    public static void main(String args[]){
        //Argumentos: Mensaje y nombre del servidor
        Socket s = null;
        try{
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            while(true){    Socket clientSocket = listenSocket.accept();
                        Connection c = new Connection(clientSocket);

            }}catch(IOException e){System.out.println("listen :" + e.getMessage());}
    }}

class Connection extends Thread{
        DataInputStream in;
        DataOutputStream out;
        Socket clientSocket;

        public Connection (Socket aClientSocket){
            try{    clientSocket = aClientSocket;
                    in = new DataInputStream(clientSocket.getInputStream());
                    out = new DataOutputStream(clientSocket.getOutputStream());
                    this.start();
            }catch(IOException e){System.out.println("Connection:" + e.getMessage());}}

        public void run(){
            try{

                String request = in.readUTF();

                out.writeUTF("Seleccione el tipo de conversión: \n 1) Celsius ---> Farenheit \n 2) Farenheit ---> Celsius");

                int opcion = in.readInt();

                out.writeUTF("Ingrese el valor de los grados: ");

                double grados = in.readDouble();

                double resultado;

                if(opcion == 1){
                    resultado = (grados * 9 / 5) + 32;
                }else{
                    resultado = (grados - 32) * 5 / 9;
                }

                out.writeUTF("Resultado: " + resultado);

                clientSocket.close();

        }catch(EOFException e){System.out.println("EOF:" + e.getMessage());
        }catch(IOException e){System.out.println("IO:" + e.getMessage());}
        }

}


