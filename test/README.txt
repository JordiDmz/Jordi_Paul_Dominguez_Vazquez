CARPETA TEST - DESCRIPCIÓN
===========================

Esta carpeta contiene todos los archivos relacionados con las pruebas y verificación del software desarrollado.

PROPÓSITO:
----------
Centraliza toda la documentación y archivos de testing:
1. Casos de prueba y scripts de testing
2. Datos de prueba y datasets de ejemplo
3. Reportes de ejecución de pruebas
4. Documentación de bugs y defectos encontrados
5. Planes de prueba y estrategias de testing

TIPOS DE ARCHIVOS ESPERADOS:
-----------------------------
- Casos de prueba (.txt, .doc, .xlsx)
- Scripts de prueba automatizadas (.java, .py, .sh)
- Datos de prueba y archivos de entrada de ejemplo
- Reportes de ejecución de pruebas
- Logs de testing y debugging
- Documentación de defectos encontrados
- Matrices de cobertura de pruebas

CATEGORÍAS DE PRUEBAS:
----------------------
1. PRUEBAS UNITARIAS:
   - Testing de métodos individuales
   - Verificación de funcionalidad de clases
   - Pruebas de casos límite

2. PRUEBAS DE INTEGRACIÓN:
   - Testing de interacción entre clases
   - Verificación del flujo de datos
   - Pruebas de interfaces

3. PRUEBAS DEL SISTEMA:
   - Testing end-to-end completo
   - Verificación de requisitos funcionales
   - Pruebas de rendimiento

4. PRUEBAS DE ACEPTACIÓN:
   - Validación con datos reales
   - Verificación de criterios de aceptación
   - Testing de usuario final

ESTRUCTURA RECOMENDADA:
-----------------------
test/
├── unit/           # Pruebas unitarias
├── integration/    # Pruebas de integración
├── system/         # Pruebas del sistema
├── data/           # Datos de prueba
├── reports/        # Reportes de ejecución
├── scripts/        # Scripts automatizados
└── defects/        # Documentación de bugs

RELACIÓN CON EL CÓDIGO:
-----------------------
Para el sistema de procesamiento de datos, las pruebas incluirían:
- Testing de lectura de archivos (Input.java)
- Verificación de cálculos estadísticos (Media.java, DesvEst.java)
- Pruebas de procesamiento de datos (Data.java)
- Testing de escritura de resultados (OutPut.java)
- Pruebas de integración del flujo completo (Logic.java)

MÉTRICAS DE TESTING:
--------------------
- Cobertura de código
- Número de casos de prueba ejecutados
- Porcentaje de pruebas exitosas
- Tiempo de ejecución de pruebas
- Número de defectos encontrados y corregidos

HERRAMIENTAS SUGERIDAS:
-----------------------
- JUnit para pruebas unitarias en Java
- Herramientas de cobertura de código
- Scripts de automatización
- Herramientas de gestión de defectos

IMPORTANCIA EN PSP:
-------------------
En el Personal Software Process:
- Documenta la estrategia personal de testing
- Registra métricas de calidad
- Facilita la mejora continua del proceso
- Proporciona evidencia de calidad del software

ESTADO ACTUAL:
--------------
La carpeta está preparada para recibir casos de prueba y documentación de testing.
Se recomienda crear la estructura de subcarpetas según las necesidades del proyecto.

MANTENIMIENTO:
--------------
- Actualizar casos de prueba con nuevas funcionalidades
- Mantener datos de prueba actualizados
- Documentar nuevos defectos encontrados
- Revisar y mejorar la cobertura de pruebas regularmente