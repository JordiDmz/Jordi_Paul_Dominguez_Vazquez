# Documentación del Código Java - Sistema de Procesamiento de Datos

## Descripción General

Este proyecto consiste en un sistema de procesamiento de datos desarrollado en Java que permite leer datos desde archivos, procesarlos estadísticamente (calculando media y desviación estándar), y escribir los resultados en archivos de salida.

## Estructura del Proyecto

El proyecto está organizado en el paquete `Model` y contiene las siguientes clases:

### 1. App.java - Clase Principal
```java
public class App {
    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.logical();
    }
}
```

**Función:** Punto de entrada del programa. Se encarga únicamente de crear una instancia de la clase Logic y ejecutar el método principal.

**Características:**
- Método main estático que inicia la aplicación
- Delega toda la lógica a la clase Logic
- Diseño simple y limpio siguiendo el principio de responsabilidad única

### 2. Logic.java - Controlador Principal
```java
public class Logic {
    private int n = 0;
    private String data;
    private String[] arrData;
    private double media;
    private double desv;

    public void logical() {
        Input input = new Input();
        Data dataProcessor = new Data();
        Media mediaCalculator = new Media();
        DesvEst desvEstCalculator = new DesvEst();
        OutPut output = new OutPut();
    }
}
```

**Función:** Actúa como el controlador central que coordina todas las operaciones del sistema.

**Características:**
- Contiene variables para almacenar el estado del procesamiento
- Crea instancias de todas las clases necesarias
- Coordina el flujo de trabajo entre las diferentes clases
- Diseñado para ser extensible y permitir futuras implementaciones

**Variables de instancia:**
- `n`: Número de elementos a procesar
- `data`: Datos en formato de cadena
- `arrData`: Array de datos procesados
- `media`: Valor de la media calculada
- `desv`: Valor de la desviación estándar calculada

### 3. Input.java - Manejo de Entrada de Datos
```java
public class Input {
    private String data;
    private BufferedReader br = null;

    public String readData(String inFile) {
        // Implementación de lectura de archivos
    }
}
```

**Función:** Maneja la lectura de datos desde archivos externos.

**Características:**
- Utiliza BufferedReader para lectura eficiente
- Manejo de excepciones IOException
- Retorna los datos como una cadena concatenada
- Cierra automáticamente los recursos utilizados

**Método principal:**
- `readData(String inFile)`: Lee un archivo completo y retorna su contenido como String

### 4. Data.java - Procesamiento de Datos
```java
public class Data {
    public String[] saveData(String data) {
        return data.split(" ");
    }
}
```

**Función:** Procesa y transforma los datos de entrada en formatos utilizables.

**Características:**
- Convierte cadenas de texto en arrays de datos
- Utiliza espacios como delimitadores por defecto
- Diseño simple y eficiente
- Fácilmente extensible para otros tipos de procesamiento

**Método principal:**
- `saveData(String data)`: Divide una cadena en un array de strings

### 5. Media.java - Cálculo de Media Aritmética
```java
public class Media {
    private double media;

    public double getMedia(String[] dataList, int n) {
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(dataList[i]);
        }
        
        media = sum / n;
        return media;
    }
}
```

**Función:** Calcula la media aritmética de un conjunto de datos numéricos.

**Características:**
- Convierte strings a valores numéricos automáticamente
- Almacena el resultado en una variable de instancia
- Manejo eficiente de arrays de datos
- Retorna el valor calculado

**Fórmula utilizada:** Media = Σ(valores) / n

### 6. DesvEst.java - Cálculo de Desviación Estándar
```java
public class DesvEst {
    public double getDesvEst(double media, String[] dataList, int n) {
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            double valor = Double.parseDouble(dataList[i]);
            sum += Math.pow(valor - media, 2);
        }
        
        return Math.sqrt(sum / n);
    }
}
```

**Función:** Calcula la desviación estándar de un conjunto de datos.

**Características:**
- Requiere la media como parámetro de entrada
- Utiliza la fórmula matemática estándar
- Manejo de operaciones matemáticas complejas (potencias y raíz cuadrada)
- Conversión automática de strings a números

**Fórmula utilizada:** σ = √(Σ(xi - μ)² / n)

### 7. OutPut.java - Manejo de Salida de Datos
```java
public class OutPut {
    public void writeData(String outFile, String outText) {
        try {
            FileWriter fw = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(outText);
            bw.close();
            System.out.println("Datos escritos correctamente en: " + outFile);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
```

**Función:** Maneja la escritura de resultados en archivos de salida.

**Características:**
- Utiliza BufferedWriter para escritura eficiente
- Manejo completo de excepciones
- Confirmación de escritura exitosa
- Cierre automático de recursos

## Flujo de Funcionamiento

1. **Inicio**: La aplicación comienza en `App.main()`
2. **Coordinación**: Se crea una instancia de `Logic` que coordina todo el proceso
3. **Instanciación**: `Logic` crea instancias de todas las clases necesarias
4. **Procesamiento** (cuando se implemente completamente):
   - `Input` lee datos desde un archivo
   - `Data` procesa y convierte los datos
   - `Media` calcula la media aritmética
   - `DesvEst` calcula la desviación estándar
   - `OutPut` escribe los resultados

## Características del Diseño

### Ventajas:
- **Modularidad**: Cada clase tiene una responsabilidad específica
- **Extensibilidad**: Fácil agregar nuevas funcionalidades
- **Mantenibilidad**: Código limpio y bien estructurado
- **Reutilización**: Las clases pueden ser utilizadas independientemente

### Patrones de Diseño Aplicados:
- **Single Responsibility Principle**: Cada clase tiene una única responsabilidad
- **Separation of Concerns**: Separación clara entre entrada, procesamiento y salida
- **Facade Pattern**: Logic actúa como una fachada que simplifica el uso del sistema

## Estado Actual del Código

El código está preparado para funcionar pero las llamadas a los métodos están comentadas en la clase `Logic`. Para activar la funcionalidad completa, se necesitaría:

1. Descomentar las líneas en el método `logical()`
2. Proporcionar archivos de entrada con datos
3. Especificar rutas de archivos de salida

## Compilación y Ejecución

```bash
# Compilar
javac App.java

# Ejecutar
java App
```

El programa actualmente se ejecuta sin mostrar salida, ya que está configurado para no mostrar mensajes durante la ejecución.

## Posibles Mejoras Futuras

1. **Validación de datos**: Agregar validación de entrada
2. **Configuración**: Permitir configuración de archivos de entrada/salida
3. **Logging**: Implementar sistema de logs
4. **Interfaz gráfica**: Agregar GUI para facilitar el uso
5. **Más estadísticas**: Agregar cálculos adicionales (mediana, moda, etc.)