### Partiendo del repositorio libro creado en el ejercicio anterior:

## Crea una nueva rama bibliografia y muestra las ramas del respositorio.

    git checkout -b bibliografia

Mostrar ramas repositorio

    git branch



## Cambia a la rama bibliografía y crea el fichero bibliografía.txt y añade la siguiente referencia:

    git checkout bibliografia

    touch bibliografia.txt

Añadimos referencia



## Comitea los cambios con el mensaje “Añadida primera referencia bibliográfica”.

    git add bibliografia.txt

    git commit -m "Añadida primera referencia bibliográfica"



## Fusiona la rama bibliografía con la rama master y eliminar la rama bibliografía.

Cambiamos a rama master

    git checkout master

Fusionamos rama bibliografia con master

    git merge bibliografia

Eliminar rama bibliografia

    git branch -d bibliografia

El -d elimina la rama solo si ya ha sido fusionada correctamente


## Crea la rama harrypotter. En esta rama modifica el fichero bibliografía.txt para que contenga las siguientes referencias:

Crea rama harrypotter

    git checkout -b harrypotter

Modificamos archivo con las referencias

    nano bibliografia.txt

Añadimos referencias



## Comitea los cambios con el mensaje “Añadida bibliografía de harry potter”.

Añadimos y comiteamos los cambios

    git add bibliografia.txt

    git commit -m "Añadida bibliografía de harry potter"




## En la rama master modifica el fichero bibliografía.txt y añade la siguiente línea:

Cambiamos a rama master

    git checkout master

Modificamos archivo bibliografia

    nano bibliografia.txt

Añadimos referencia



## Fusiona la rama harrypotter con la rama master. Resuelve el conflicto y comitea los cambios.

Fusionamos rama

    git merge harrypotter

Aquí es donde se producirá un conflicto, ya que ambos cambios (de la rama master y harrypotter) modifican el mismo archivo bibliografia.txt.


Resolver conflicto, Git marcará las secciones del archivo en conflicto. Abre el archivo bibliografia.txt para resolver el conflicto:

    nano bibliografia

Se verá algo como esto:

    <<<<<<< HEAD
    El Rey León, Rob Minkoff, Roger Allers
    =======
    Harry Potter y la piedra filosofal, J. K. Rowling
    Harry Potter y el cáliz de fuego, J. K. Rowling
    >>>>>>> harrypotter

Necesitarás editarlo para que quede como desees. Elimina las marcas <<<<<<<, ======= y >>>>>>>, y combina las referencias de manera correcta:

    El Rey León, Rob Minkoff, Roger Allers
    Harry Potter y la piedra filosofal, J. K. Rowling
    Harry Potter y el cáliz de fuego, J. K. Rowling

Commiteamos una vez se resuelve el conflicto:

    git add bibliografia.txt

    git commit -m "Resuelto conflicto y añadidas referencias"
