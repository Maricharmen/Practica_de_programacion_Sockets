# Inciso B

## Implementación de un Conversor de Temperaturas utilizando UDP

### Descripción

Se desarrolló una versión de cliente y servidor utilizando sockets UDP para implementar un conversor de temperaturas.

El cliente envía una lectura en grados Celsius dentro del intervalo [-200, 200]. El servidor recibe el valor, verifica que esté dentro del rango permitido y calcula su equivalente en grados Fahrenheit utilizando la fórmula:

$$
F = \left(C \times \frac{9}{5}\right) + 32
$$

Si el valor está fuera del rango permitido, el servidor envía un mensaje de error.

### Interacción

1. El cliente crea un DatagramSocket.

2. El cliente envía un DatagramPacket con la temperatura en Celsius.

3. El servidor recibe el paquete mediante receive().

4. El servidor convierte la temperatura.

5. El servidor envía un nuevo DatagramPacket como respuesta.

6. El cliente recibe la respuesta y la muestra en pantalla.

La comunicación se realiza mediante el intercambio de datagramas independientes, ya que UDP no establece una conexión previa entre cliente y servidor.

### Compilación de los programas

Para ejecutar los ejemplos proporcionados, se realizaron los siguientes pasos:

1. Se guardaron los archivos:

- UDPConversorTemperaturaClient.java

- UDPConversorTemperaturaServer.java

2. Se abrió una terminal dentro de la carpeta y se compiló cada archivo mediante los siguientes comandos:

```bash
cd Practica_UCP\ConversorDeTemperatura\src
javac UDPConversorTemperaturaServer.java
javac UDPConversorTemperaturaCliente.java
```

4. Al compilar correctamente, se generaron los archivos .class, lo que indica que la compilación fue exitosa.

### Ejecución

Primero se ejecutó el servidor: 

```bash
java UDPConversorTemperaturaServer
```

En una segunda terminal se ejecutó el cliente:

```bash
java UDPConversorTemperaturaCliente
```

Luego el cliente solicita ingregar la temperatura en Celsius 

El cliente envía el mensaje <Entrada del cliente> al servidor, y el servidor responde con la conversión de Celsius a Fahrenheit.

- Corrida 1

Entrada del cliente:
```bash
0
```

Salida:
```bash
Fahrenheit: 32.0
```

- Corrida 2

Entrada del cliente:
```bash
100
```

Salida:
```bash
Fahrenheit: 212.0
```

- Corrida 3

Entrada del cliente:
```bash
300
```

Salida:
```bash
Error: fuera del rango permitido
```



