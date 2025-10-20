# Proyecto: The Sandwich Guy - Avance 1

## Integrantes del grupo

| Nombre completo | Carné | Usuario Git | Correo de Git |
|------------------|--------|--------------|----------------|
| Edson Jatniel Acuña Sánchez | FH21010293 | edson1452 | edson.acuna.sanchez@gmail.com |
| Abdiel Calderón Navarro | FI25052739 |GarielCR| calderonnavarro18@gmail.com |
| Bryan Yosué Obando Nicundano | FH18005873 | YoshBr | bryanobando2115@gmail.com |
| Cristina Fabiola Vindas Méndez | FI24039196 | crisvm01 | cvindas10827@ufide.ac.cr |

## Entorno de desarrollo utilizado
- **Editores/IDEs:** NetBeans y Visual Studio Code
- **Versión de Java:** Java SE 21 (OpenJDK)
- **Librerías utilizadas:**  **javax.swing** para la interfaz gráfica (GUI)

---
#  Estructura del proyecto
---
## Clases Principales

### 🂡 Carta.java
Representa una carta individual de la baraja

**Atributos:**
- palo: tipo de carta (Corazones, Diamantes, Tréboles, Picas)
- valor: nombre de la carta (As, 2... K)
- valorNumerico: valor numérico asociado (1–13)

**Métodos destacados:**
- calcularValorNumerico(String valor): Devuelve el valor numérico según la carta.  
- crearBaraja(): Crea y retorna un arreglo con las 52 cartas de la baraja.  
- toString(): Muestra el nombre y palo de la carta.

---

### Main.java
Prueba la clase **Carta** creando el arreglo completo de cartas e imprimiendo su contenido.

**Funciones:**
- Generar las 52 cartas de la baraja.
- Mostrar en consola todas las cartas creadas.
- Validar que la baraja esté completa.

---

### menuInicio.java
Interfaz gráfica inicial del juego.  
Presenta dos botones:  
- **“¡Iniciar Partida!”**   
- **“¡Continuar Partida!”**  
---

### ProyectoCartas.java
Archivo principal que ejecuta la aplicación.  
Inicia la ventana **menuInicio** y configura su comportamiento al cerrar

---------
## Instructivo de Uso

### Instalación

1. Tener instalado **Java SE 21 y JDK 21** 
2. Verificar la instalación desde la terminal
3. Abrir Visual Studio Code y abrir la carpeta raíz del proyecto.
4. Instalar la extensión Java Extension Pack en VS Code, que permite compilar y ejecutar proyectos Java con facilidad.


### Compilación
1. Abrir la terminal integrada en Visual Studio Code
2. Ingresar a la carpeta raíz del proyecto donde se encuentran el main 
3. Compilar todos los archivos .java

### Ejecución

1. Desde la terminal, ejecutar la clase principal ProyectoCartas

2. Al ejecutar, se abrirá la ventana principal menuInicio con las opciones:

**¡Iniciar Partida!**

**¡Continuar Partida!**

3. Durante este Avance 1, la aplicación permite:

 - Visualizar la interfaz inicial del juego.
 - Verificar en la consola la creación de las 52 cartas de la baraja inglesa, mostrando nombres y valores numéricos
----
## Ejecución del Proyecto

Al ejecutar la clase **Carta**, se muestra:

=== PRUEBA CLASE CARTA - AVANCE 1 ===

Carta individual: As de Corazones

valor numerico: 1

Total de cartas en baraja: 52

Primeras 5 cartas:
1. As de Corazones (valor: 1)
2. 2 de Corazones (valor: 2)
3. 3 de Corazones (valor: 3)
4. 4 de Corazones (valor: 4)
5. 5 de Corazones (valor: 5)

