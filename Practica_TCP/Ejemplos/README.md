#Ejemplos

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
java TCPServer
```

En una segunda terminal se ejecutó el cliente:

```bash
java TCPClient 
```

El cliente efectúa una comunicación e intercambio de datos con el servidor.

### Ejecución del Ejemplo 2 

Primero se ejecutó el servidor: 

```bash
java TCPServer
```

En una segunda terminal se ejecutó el cliente:

```bash
java TCPClient
```

El cliente efectúa una comunicación e intercambio de datos con el servidor.

### Operaciones que permiten la interaccion

#### En el Cliente

- Socket s = new Socket(serverHost, serverPort);
Crea el socket del cliente.

- String serverHost = "localhost"
Crea una cadena con el host del servidor.

- int serverPort = 7896
Asigna un entero con el puerto del servidor

- DataInputStream in = new DataInputStream(s.getInputStream());
Crea un flujo de datos de entrada y recibe información mediante el socket

- DataOutputStream out = new DataOutputStream(s.getOutputStream());
Crea un flujo de datos de salida y envía información mediante el socket

- out.writeUTF();
Envía información al servidor codificada en UTF

- in.readUTF();
Lee información del servidor codificada en UTF

#### En el Servidor

- ServerSocket listenSocket = new ServerSocket(serverPort);
Crea un socket de escucha que establecerá una conexión con algún cliente

- Socket clientSocket;
Crea el socket del cliente

- DataInputStream in = new DataInputStream(clientSocket.getInputStream());
Crea un flujo de entrada de datos que envía el cliente

- DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
Crea un flujo de salida de datos hacía el cliente

