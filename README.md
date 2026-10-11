# 👟 CalzaModa Step - Sistema de Control de Inventario y Ventas

Aplicación de consola desarrollada en Java para la gestión de inventario y procesamiento de ventas de la tienda minorista **CalzaModa Step**. El sistema está estructurado bajo buenas prácticas de Programación Orientada a Objetos (POO), separando la lógica de negocio, la gestión de usuarios y el estado global del sistema.

## 🎓 Datos Institucionales

* **Universidad:** Universidad Tecnológica de Panamá
* **Centro Regional:** Centro Regional de Chiriquí
* **Materia:** [Desarrollo de Software II]
* **Semestre:** [II Semestre 2026]
* **Profesor:** [Jaime Palacios]
* **Estudiante:** [Donaciano Rosas]

---

##  Características Principales

1. **Encabezado Institucional:** Muestra los datos de la universidad y el estudiante al inicio.
2. **Menú de Acceso Principal:** Interfaz de consola dividida en 3 secciones:
   * Sección Administración
   * Sección Cliente o Usuario (Cajero)
   * Sección Reportes
3. **Gestión de Usuarios:** El administrador puede registrar y modificar los datos del cajero (Usuario) en memoria.
4. **Configuración de Parámetros Globales:** El administrador puede establecer el precio del producto, reabastecer el stock y configurar tarifas base.
5. **Procesamiento de Ventas:** El cajero valida su identidad, procesa la venta, calcula automáticamente el **ITBMS (7%)** y descuenta el stock unitario.
6. **Reportes Financieros:** Muestra el nombre del cajero operativo y las métricas financieras de las ventas realizadas.

---

## 🏗️ Arquitectura y Clases del Proyecto

El proyecto sigue el paradigma de Programación Orientada a Objetos, utilizando encapsulamiento y separación de responsabilidades:

* **`Main.java`**: Punto de entrada de la aplicación. Controla el flujo principal y el bucle del menú.
* **`Encabezado.java`**: Responsable de imprimir los datos universitarios y el menú de acceso principal en consola.
* **`Administrador.java`**: Representa al supervisor. Tiene la facultad de inicializar objetos `Usuario` y modificar los parámetros globales.
* **`Usuario.java`**: Representa al cajero. Contiene la lógica para validar identidad y procesar las ventas (cálculo de ITBMS y descuento de stock).
* **`LogicaSistema.java`**: Clase que almacena el estado global y los parámetros del sistema (precio del día, stock disponible, tasa de ITBMS, métricas financieras).
* **`Utilidades.java`**: Clase de herramientas con métodos estáticos (ej. limpiar consola, formatear texto) para reutilización en todo el proyecto.

---

## 🚀 Cómo Compilar y Ejecutar

### Requisitos
* Java Development Kit (JDK) 11 o superior.
* Terminal o Consola de comandos.

### Compilación
Para compilar todos los archivos de la carpeta `src` y enviar los `.class` a la carpeta `bin`, ejecuta el siguiente comando en la raíz del proyecto:

```bash
javac -d bin src/com/calzamoda/*.java
