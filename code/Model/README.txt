CARPETA MODEL - DESCRIPCIÓN
============================

Esta carpeta contiene el código fuente principal del sistema de procesamiento de datos estadísticos.

CONTENIDO:
----------

ARCHIVOS JAVA (.java):
- App.java: Clase principal que contiene el método main() y punto de entrada del programa
- Logic.java: Controlador central que coordina todas las operaciones del sistema
- Input.java: Maneja la lectura de datos desde archivos externos
- Data.java: Procesa y transforma los datos de entrada en formatos utilizables
- Media.java: Calcula la media aritmética de conjuntos de datos numéricos
- DesvEst.java: Calcula la desviación estándar de conjuntos de datos
- OutPut.java: Maneja la escritura de resultados en archivos de salida

ARCHIVOS COMPILADOS (.class):
- Archivos bytecode generados por el compilador Java para cada clase
- Necesarios para la ejecución del programa

PROPÓSITO:
----------
Esta carpeta implementa un sistema modular para:
1. Leer datos numéricos desde archivos
2. Procesar los datos y convertirlos en arrays
3. Calcular estadísticas (media y desviación estándar)
4. Escribir los resultados en archivos de salida

ARQUITECTURA:
-------------
- Patrón de diseño: Separación de responsabilidades
- Cada clase tiene una función específica y bien definida
- Diseño modular que permite fácil mantenimiento y extensión
- Flujo de control centralizado a través de la clase Logic

COMPILACIÓN Y EJECUCIÓN:
------------------------
Para compilar: javac App.java
Para ejecutar: java App

ESTADO ACTUAL:
--------------
El código está funcional pero las operaciones principales están comentadas en Logic.java.
Para activar la funcionalidad completa, se requiere descomentar las llamadas a métodos
y proporcionar archivos de entrada con datos numéricos.