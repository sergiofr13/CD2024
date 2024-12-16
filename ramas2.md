### Crear nueva rama llamada autoria y cambiate a ella

    git checkout -b autoria

Este comando crea la rama autoria y te cambia a ella automáticamente.


### Añadir nombre de usuario (a23...) y su correo al fichero autores.txt

    touch autores.txt

    nano autores.txt

Añadimos nombre de usuario y correo del autor


### Hacer commit con el mensaje

    git add autores.txt

    git commit -m "Añadido el nombre y correo del autor al archivo autores.txt"


### Subir los cambios de la rama autoria al repositorio en GitHub

    git push origin autoria


### Visualiza en el repossitorio remoto la aparición de la rama

En la parte superior de la lista de archivos, encontrarás un botón de "Branch", alli se vera la rama
