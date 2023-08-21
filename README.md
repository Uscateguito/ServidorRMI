# Configuración de RMI

Este es un pequeño programa de pruebas para implementar un servidor RMI, para un sistema distribuido simple (Puede ejecutarse de manera local tal como está, en cambio si se quiere ejecutar en un sistema distribuido es necesario hacer uso de los JAR creados que sin embargo no funcionan bien por ahora).

## Ejecución

- Inicialmente, para RMI es necesario que sea implementado el servidor en la máquina que va a proveer el servicio RMI, esto se debe ejecutar desde la carpeta que contenga al servidor:

En windows:

```shell
start rmiregistry
```

en linux:

```shell
rmiregistry &
```

- Para ejecutar el programa adecuádamente se deben compilar las clases (aunque en este caso están precompiladas) con el siguiente comando:

```shell
javac clase1.java clase2.java ... clasen.java
```

*Sin embargo, para que la terminal dinámicamente comprenda que se trata de diferentes proyectos, esta compilación debe realizarse desde la carpeta raiz (RMI en este caso)*

* Una vez realizado esto, ejecutamos los programas con los PSVM que para este caso particular van a ser: **Cliente** y todos los de server que contengan **Impl***

```shell
java Cliente/Cliente

java ServerCalculo/ImplementacionServer

...
```

- Para crear los .jar, es necesario igualmente hacer el proceso desde una carpeta raiz (cfm para agregar también el manifiesto)

```shell
jar cfm x.jar Manifest.txt x1.class x2.class ... xn.class
```

Para ejecutarlos:

```shell
java -jar x.jar
```

Finalmente y por cuestiones de interés personal, es posible destinar los documentos compilados con el siguiente comando:

```shell
javac -d <dir_deseada> x.java
```

## Autor:

* [Alejandro Uscátegui](https://github.com/Uscateguito)
