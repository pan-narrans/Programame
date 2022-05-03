# Pic, poc, pic... pong!

>Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB

En septiembre de 1972 veía la luz la Magnavox Oddysey, la primera videoconsola de la historia, tras el esfuerzo de Ralph Baer para convertir su caja marrón en un producto comercial. A medio camino entre consola y juego de mesa (incluía una baraja de cartas, fichas de póker, una ruleta y láminas para adherir a la televisión), su éxito puso en marcha la industria del videojuego.

Solo dos meses después, Atari sacó su conocida máquina de arcade "Pong". Era un clon de uno de los juegos de la Odyssey, lo que desencadenó una batalla legal entre Magnavox y Atari.

Cada jugador controlaba una "raqueta" situada en extremos contrarios de la pantalla. Una bola se desplazaba de lado a lado y debía ser golpeada por el jugador correspondiente para evitar que superara el límite de la pantalla. Al ser golpeada, la pelota rebotaba en dirección opuesta, retando al jugador contrario. Si la bola impactaba con el borde superior o inferior de la pantalla, rebotaba manteniendo el sentido. Si un jugador fallaba al golpear la bola, esta superaba el límite de la pantalla y el contrincante conseguía un punto a favor. Al reaparecer, la bola se dirigía de nuevo hacia él.

Al empezar una partida, la bola aparecía en el centro de la pantalla y se desplazaba hacia la derecha, de modo que el jugador situado en ese lado era siempre el primero en golpear.

Pong incorporaba sonido y marcador de puntos, algo de lo que carecía la versión original de Odyssey. Tenía tres "beeps" característicos distintos, que sonaban cuando la pelota golpeaba una raqueta, cuando golpeaba el borde superior o inferior, o cuando un jugador no golpeaba la bola y el contrincante se llevaba un punto. Dados los sonidos reproducidos por el juego, ¿eres capaz de reconstruir el marcador?

## Entrada

Cada línea de la entrada se corresponde con un caso de prueba que el programa deberá procesar.

Cada caso de prueba comienza con un número indicando el número de sonidos reproducidos en la partida en curso. La onomatopeya para el sonido de la bola golpeando una raqueta es "PIC". El sonido de la bola golpeando el borde superior e inferior es "POC". Por último, cuando la bola supera un jugador y su oponente gana un punto suena "PONG!". Se garantiza que todos los casos terminan con un "PONG!".

El programa debe terminar al leer un 0 (partida sin sonidos).

## Salida

Por cada caso de prueba el programa escribirá el marcador, indicando primero el número de puntos ganados por el jugador de la izquierda y luego el de la derecha, separados por un espacio. En cada partida, la bola siempre comienza desplazándose hacia la derecha. Cuando alguien pierde un punto, la bola comienza yendo de nuevo hacia él, como si el contrario hubiera "sacado".

## Entrada de ejemplo

```cmd
4 PIC POC PIC PONG!
9 PIC POC PONG! PONG! PIC PIC PIC POC PONG!
0
```

## Salida de ejemplo

```cmd
1 0
1 2
```

---

> [Link  al ejercicio.](https://www.aceptaelreto.com/problem/statement.php?id=616&cat=151)
