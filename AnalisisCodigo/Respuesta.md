# Actividad: Análisis de Código 

## Enunciado

Dada la clase `Libro` con atributos privados `titulo` y `prestado`, y el método
`prestar()` que cambia el estado solo si el libro no estaba prestado, se pregunta:

Si se ejecuta en la clase principal:

```java
Libro l1 = new Libro("Cien Años de Soledad");
l1.prestar();
l1.prestar();
```

¿Cuál será la salida exacta por consola y cuál es el estado final del
atributo `prestado` dentro del objeto `l1`?

## Respuesta

### Salida exacta por consola

```
Libro prestado con éxito.
El libro ya estaba prestado.
```

### Estado final del atributo

El atributo `prestado` del objeto `l1` queda en **`true`**.

## Explicación paso a paso

1. Al crear el objeto con `new Libro("Cien Años de Soledad")`, el constructor
   inicializa `titulo` con el valor recibido y `prestado` en `false`.

2. **Primera llamada a `l1.prestar()`**: como `prestado` es `false`, la
   condición `!this.prestado` es verdadera, entonces el atributo cambia a
   `true` y se imprime `"Libro prestado con éxito."`.

3. **Segunda llamada a `l1.prestar()`**: ahora `prestado` ya es `true`, por lo
   que `!this.prestado` es falso y se ejecuta el `else`, imprimiendo
   `"El libro ya estaba prestado."`. El atributo **no cambia** en esta llamada.

## Conclusión

El `if` dentro del método `prestar()` actúa como una **guarda de estado**:
el objeto protege su propio estado interno e impide que el libro se preste
dos veces, aunque desde afuera se llame el método varias veces. Esto es
posible gracias al encapsulamiento: como `prestado` es privado, la única
forma de cambiarlo es a través del método `prestar()`, que tiene el control.

## Verificación

En esta misma carpeta se incluye el código (`Libro.java` y `Main.java`) para
compilar y verificar que la salida coincide con lo analizado:

```bash
javac Libro.java Main.java
java Main
```
