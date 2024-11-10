# Ejercicio 1
### Paso 1

Primero creamos dentro de la carpeta ud02, 2 ficheros llamados "sergio.txt" y "actividades.txt"

    touch sergio.txt
    touch actividades.txt

Despues de esto hacemos el commit

    git commit -m "ejer1_version_1"

Si queremos subirlo al repositorio de GitHub

    git push

### Paso 2

Una vez editamos el fichero de sergio.txt comentando por que se está en este ciclo realizamos otro commit.

    git commit -m "ejer1_version_1.1"

Y para subirlo al repositorio de github, hacemos:

    git push

### Paso 3

Crear una carpeta con dos ficheros, todo desde línea de comandos.

Pues dentro de la carpeta de ud02/ExerGit creamos dicha carpeta con 2 ficheros.

    mkdir carpeta
    touch fichero1 fichero2


### Paso 4

Realizar otro commit con las siguientes modificaciones:

-Eliminar del segundo fichero una de tus aficciones.

-Ignora la carpeta con los dos ficheros.


### Paso 5

Realiza un checkout para volver a las primeras versiones de los ficheros .txt (el primer commit).

Lo primero que hacemos es un:

    git log

De esta manera vemos el historial de commits hechos.

Luego hacemos un:

    git checkout hash_del_commit

Remplazamos hash_del_commit por el valor del hash encontrado en "git log"

Una vez hecho entraremos en el estado "detached HEAD". Esto significa que no estás en una rama activa, sino que solo has revisado el estado de ese commit. Si solo hiciste un checkout, usa git checkout para volver a tu rama original.

    git checkout main


#### FIN