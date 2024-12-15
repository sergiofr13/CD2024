# Compilar Java

## Paso 1:

Ecribimos programa sencillo en Java:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo desde Java!");
    }
}
```
Guardamos el archivo con el nombre **HolaMundo.java** 

* El nombre del archivo debe coincidir con el nombre de la clase pública.

## Paso 2:

Compilar el archivo:

Navegamos hasta la carpeta donde guardamos el archivo **HolaMundo.java**

Escribimos el siguiente comando para compilar el archivo:

    javac HolaMundo.java

Esto generará un archivo llamado **HolaMundo.class** que es el bytecode compilado que la máquina virtual de Java puede ejecutar.

## Paso 3:

Ejecutamos el archivo:

Escribimos el siguiente comando:

    java HolaMundo

Que ejecutara el programa, en este caso imprimira un Hola Mundo.





# Compilar C

## Paso 1:

Ecribimos programa sencillo en C:

```C
#include <stdio.h>

int main() {
    printf("¡Hola Mundo desde C!\n");
    return 0;
}
```
Guardamos el archivo con el nombre **hola_mundo.c**

## Paso 2:

Compilamos el archivo:

Navegamos hasta la carpeta donde guardamos el archivo.

Escribimos el siguiente comando para compilar:

    gcc hola_mundo.c -o hola_mundo

Lo que hace es utilizar el compilador gcc que generará un archivo ejecutable llamado **hola_mundo**


## Paso 3:

Ejecutar el archivo

Para ejecutar el programa se escribe el siguiente comando:

    ./hola_mundo

Lo que imprimira un "Hola Mundo" desde C




# Python

## Paso 1:

Creamos archivo cualquiera **hola_mundo.py** 

Navegamos hasta la carpeta donde lo tengamos.

Escribimos el comando:

    python hola_mundo.py

Lo que imprimira un "Hola Mundo"

En caso de tener python3 instalado puede que sea necesite usar:

    python3 hola_mundo.py

## FIN 