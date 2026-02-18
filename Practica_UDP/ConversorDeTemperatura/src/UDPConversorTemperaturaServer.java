import java.net.*;
import java.io.*;

public class UDPConversorTemperaturaServer {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9876);
            byte[] buffer = new byte[1000];

            System.out.println("Servidor de Temperatura UDP iniciado...");

            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                socket.receive(request);

                String mensaje = new String(request.getData(), 0, request.getLength());
                double celsius = Double.parseDouble(mensaje);

                String respuesta;

                if (celsius >= -200 && celsius <= 200) {
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    respuesta = "Fahrenheit: " + fahrenheit;
                } else {
                    respuesta = "Error: fuera del rango permitido";
                }

                byte[] sendData = respuesta.getBytes();

                DatagramPacket reply = new DatagramPacket(
                        sendData,
                        sendData.length,
                        request.getAddress(),
                        request.getPort()
                );

                socket.send(reply);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
