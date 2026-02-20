# Instrucciones

## Implementación de un Conversor de Temperaturas utilizando TCP

### Descripción

Se desarrolló una versión de cliente y servidor utilizando sockets TCP para implementar un conversor de temperaturas dinámico.

Se establece una conexión entre el Cliente y el Servidor, 

El Cliente solicita una conversión de grados a lo que el Servidor le preguntará por el tipo de conversión que realizará (Celsious ---> Farenheit / Farenheit ---> Celsious).

Una vez el Cliente seleccione el tipo de conversión este mismo enviará una valor arbitrario a lo que el Servidor ejecutará la fórmula de conversión pertinente y devolverá el resultado final al Cliente

$$
F = \left(C \times \frac{9}{5}\right) + 32
$$


$$
C = (C - 32) \times \frac{5}{9}
$$

### Interacción

1. El cliente y el servidor crean un Socket y establecen conexión mediante un "Host" y "Puerto" comúnes.

2. El cliente solicita una conversión de temperatura.

3. El servidor recibe la solicitud y devuelve las opciones de conversión.

4. El cliente selecciona el tipo de conversión de temperatura y envía el número de grados a convertir.

5. El servidor recibe los datos y utilizá la formula correspondiente para transformar los grados.

6. El cliente recibe la respuesta y la muestra en pantalla.

### Compilación de los programas

Para ejecutar los ejemplos proporcionados, se realizaron los siguientes pasos:

1. Se guardaron los archivos:

- TCPClient.java

- TCPServer.java

2. Se abrió una terminal dentro de la carpeta y se compiló cada archivo mediante los siguientes comandos:

```bash
cd Practica_TCP\ConversorDeTemperatura\src
javac TCPClient.java
javac TCPServer.java
```

4. Al compilar correctamente, se generaron los archivos .class, lo que indica que la compilación fue exitosa.

### Ejecución

Primero se ejecutó el cliente: 

```bash
java TCPClient
```

En una segunda terminal se ejecutó el servidor:

```bash
java TCPServer
```

Luego de establecer conexión el Servidor solicita el tipo de conversión y el valor numérico de los grados 

El cliente envía el mensaje <Entrada del cliente> al servidor, y el servidor responde con la conversión correspondiente de grados.

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



