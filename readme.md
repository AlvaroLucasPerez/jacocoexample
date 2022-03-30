# Prueba de IntelliJ con JaCoCo

Este plugin de maven de Java Coverage 
Tool nos permite calcular la complejidad de métodos de forma
que podamos verificar nuestros cálculos.

Este plugin puede integrarse con eclipse y también con IntelliJ IDEA pero 
la mejor forma de ejecutarlo es desde la terminal.

Para ello, con el repositorio clonado, abrís la terminal y ejecutáis:

## Linux/MacOs

```bash
./mvnw install
./mvnw clean jacoco:prepare-agent install jacoco:report
```

## Windows CMD

```cmd
mvnw install
mvnw clean jacoco:prepare-agent install jacoco:report
```

Si todo ha funcionado correctamente, debe haber creado el archivo `index.html` 
en la ruta relativa: `target/site/jacoco/index.html`. Abridlo para comprobar que
sale el reporte de la cobertura. 

> Si hay algún error, el **99%** de los errores tienen que ver con una mala configuración
del entorno de java que se solucionan configurando la variable de entorno `JAVA_HOME`
para que tenga la ruta absoluta al JDK que queramos usar. En los apuntes de la
asignatura, en los anexos viene la configuración, pero de manera rápida, podemos utilizar
cualquier manual para configurarla. 