import java.net.*;
import java.io.*;

public class UDPConversorTemperaturaCliente {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Ingrese temperatura en Celsius [-200,200]: ");
            String mensaje = teclado.readLine();

            byte[] data = mensaje.getBytes();

            DatagramPacket request = new DatagramPacket(
                    data,
                    data.length,
                    serverAddress,
                    serverPort
            );

            socket.send(request);

            byte[] buffer = new byte[1000];
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);

            socket.receive(reply);

            String respuesta = new String(reply.getData(), 0, reply.getLength());

            System.out.println("Respuesta del servidor: " + respuesta);

            socket.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

