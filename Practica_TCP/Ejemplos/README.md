# Inciso A

## Compilación, ejecución e identificación de operaciones

### Compilación de los programas

Para ejecutar los ejemplos proporcionados, se realizaron los siguientes pasos:

1. Se guardaron los archivos:

- TCPClient.java

- TCPServer.java

2. Se abrió una terminal dentro de la carpeta y se compiló cada archivo mediante los siguientes comandos:

```bash
cd Practica_TCP\Ejemplos\Ejemplo01\src
javac TCPServer.java
javac TCPClient.java
```

```bash
cd Practica_TCP\Ejemplos\Ejemplo02\src
javac TCPServer.java
javac TCPClient.java
```


4. Al compilar correctamente, se generaron los archivos .class, lo que indica que la compilación fue exitosa.

### Ejecución del Ejemplo 1

Primero se ejecutó el servidor: 

```bash
java UDPServer
```

En una segunda terminal se ejecutó el cliente:

```bash
java UDPClient Hola localhost
```

El cliente envía el mensaje “Hola” al servidor, y el servidor responde enviando el mismo mensaje de vuelta.

### Ejecución del Ejemplo 2 

Primero se ejecutó el servidor: 

```bash
java UDPDiscardServer
```

En una segunda terminal se ejecutó el cliente:

```bash
java UDPDiscardClient localhost
```

El cliente envía mensajes al servidor. El servidor recibe los mensajes y los imprime en pantalla, pero no envía ninguna respuesta al cliente.

### Operaciones que permiten la interaccion

#### En el Cliente

- new DatagramSocket()
Crea el socket del cliente.

- InetAddress.getByName()
Obtiene la dirección IP del servidor.

- new DatagramPacket()
Construye el paquete con el mensaje.

- send()
Envía el datagrama al servidor.

- receive()
Recibe el datagrama de respuesta (solo en el ejemplo 1).

#### En el Servidor

- new DatagramSocket(puerto)
Abre el puerto para escuchar solicitudes.

- receive()
Recibe los paquetes enviados por el cliente.

- getAddress() y getPort()
Obtienen la dirección y el puerto del cliente.

- send()
Envía la respuesta (solo en el ejemplo 1).
