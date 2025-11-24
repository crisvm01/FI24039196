# Proyecto: The Sandwich Guy - Avance 2

## Integrantes del grupo

| Nombre completo | Carné | Usuario Git | Correo de Git |
|------------------|--------|--------------|----------------|
| Abdiel Calderón Navarro | FI25052739 | GarielCR | calderonnavarro18@gmail.com |
| Bryan Yosué Obando Nicundano | FH18005873 | YoshBr | bryanobando2115@gmail.com |
| Cristina Fabiola Vindas Méndez | FI24039196 | crisvm01 | cvindas10827@ufide.ac.cr |

## Editores Utilizados
- **Editor/IDE:** Visual Studio Code  
- **Versión de Java:** Java SE 21 (OpenJDK)  
- **Librerías utilizadas:** javax.swing para la interfaz gráfica  

---

# Estructura del proyecto

En este avance se implementaron las clases principales para manejar la baraja de cartas y la mecánica básica del juego. La descripción general de cada componente es la siguiente:

### Carta
Representa cada carta de la baraja con su palo, color, valor numérico, nombre y símbolo. Permite mostrarla de manera visual en la interfaz.

### Caja
Almacena las 52 cartas iniciales de la baraja en orden. Se implementó como **lista doblemente enlazada**, permitiendo agregar cartas, remover la primera, eliminar cartas por posición o al azar, y convertir la baraja a lista para mostrarla.

### Mazo
Representa la pila de cartas barajadas. Se implementa como **pila (Stack)** usando `ArrayList`, con operaciones para agregar cartas al tope, retirar cartas, revisar la carta superior y obtener el tamaño de la pila.

### Mano
Almacena hasta 8 cartas que el jugador tiene disponibles. Se implementa como **lista circular simple**, permitiendo agregar cartas al final, convertirlas en lista para mostrarlas y limpiar la mano.

### Pozo
Representa la colección de cartas descartadas. Se implementa como **cola (Queue)** usando `LinkedList`, permitiendo agregar cartas al final, retirarlas del frente y consultar el tamaño.

### Interfaz gráfica
Se implementó con **Java Swing**:
- **menuInicio:** Ventana inicial con opciones para iniciar o continuar la partida.  
- **mesaStage1:** Mesa de juego que muestra la Caja, Mazo, Mano y Pozo. Incluye botón **Barajar Cartas**, que mezcla las cartas, las transfiere al Mazo y llena la Mano inicial.

---

## Instructivo de Uso

### Instalación
1. Descargar o clonar la carpeta del proyecto en su computadora.  
2. Verificar que Java SE 21 esté instalado.
3. Abrir Visual Studio Code y abrir la carpeta raíz del proyecto.
4. Instalar la extensión Java Extension Pack en VS Code para facilitar la compilación y ejecución.

### Compilación y Ejecución

1. Abrir la terminal integrada en VS Code.
2. Navegar a la carpeta raíz del proyecto donde se encuentran todos los archivos .java.
3. Compilar todas las clases.
4. Ejecutar la aplicación.
5. La ventana menuInicio se abrirá y permitirá.
- Iniciar Partida: Abre la mesa de juego y carga las cartas.
- Continuar Partida: Funcionalidad reservada para avances futuros.

6. En la mesa de juego (mesaStage1) podrá:
- Visualizar la Caja con 52 cartas ordenadas.
- Presionar Barajar Cartas para mezclar la baraja, transferir cartas al Mazo y llenar la Mano.
- Observar la actualización dinámica del Mazo, Mano y Pozo con colores y símbolos correspondientes.

