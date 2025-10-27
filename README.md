# Monty-Hall
Tenéis que crear un simulador del problema de Monty Hall: un concursante tiene que elegir entre 3 puertas cerradas - sólo 1 de ellas contiene premio. Cuando la elige, el presentador abre una de las otras dos mostrando que no tiene premio. ¿Debe del concursante cambiar su puerta por la otra puerta que está cerrada? 

Simula X partidas de forma automática y calcula en cuantas ha tenido éxito el concursante por cambiar su elección. Cuando más alto sea el valor de X, más acertada será la estadística. 



public class SimuladorMontyHall {



    public static void main(String[] args) {



        // ============================================================

        // 🧩 EJERCICIO: SIMULADOR DEL PROBLEMA DE LAS TRES PUERTAS (SIN FUNCIONES)

        // ============================================================

        //

        // 🎯 OBJETIVO:

        // Simular N partidas (por ejemplo, 100) del juego de las 3 puertas (Monty Hall)

        // para comparar dos estrategias:

        //   A) Mantener la puerta elegida inicialmente.

        //   B) Cambiar a la otra puerta disponible después de que el presentador abra una.

        //

        // ------------------------------------------------------------

        // 🧠 RESTRICCIÓN:

        // - TODO el código debe ir en este main. NO usar funciones auxiliares.

        //

        // ------------------------------------------------------------

        // 🏗️ PASOS A IMPLEMENTAR (TODO en main):

        //

        // 1) Declarar variables de control:

        //    - int partidas = 100;  // o el número que quieras

        //    - int victoriasManteniendo = 0;

        //    - int victoriasCambiando = 0;

        //

        // 2) Bucle for que repita 'partidas' veces la simulación:

        //    En cada iteración:

        //    - Generar aleatoriamente la puerta con premio: int premio = (int)(Math.random()*3); // 0,1,2

        //    - Generar la elección inicial del concursante: int eleccion = (int)(Math.random()*3);

        //

        //    - Determinar qué puerta abre el presentador:

        //        * Debe ser una puerta distinta de 'eleccion' y que NO tenga el premio.

        //        * Elegir una de las válidas (si hay dos, puedes escoger una al azar).

        //        * Guardar en: int abierta = ...;

        //

        //    - Determinar la otra puerta cerrada distinta de 'eleccion' y de 'abierta':

        //        * Guardar en: int otraCerrada = ...;

        //

        //    - Estrategia A (mantener):

        //        * Si 'eleccion' == 'premio', sumar 1 a victoriasManteniendo.

        //

        //    - Estrategia B (cambiar):

        //        * Si 'otraCerrada' == 'premio', sumar 1 a victoriasCambiando.

        //

        // 3) Al terminar el bucle:

        //    - Imprimir:

        //        "Partidas: X"

        //        "Victorias manteniendo: X (Y%)"

        //        "Victorias cambiando:   X (Y%)"

        //

        //    - Comentar brevemente cuál estrategia resulta mejor en la simulación.

        //      (Debería salir ~33% manteniendo y ~66% cambiando).

        //

        // ------------------------------------------------------------

        // 💡 PISTAS:

        // - Representa las puertas como 0, 1 y 2.

        // - Para hallar 'abierta', puedes usar un pequeño bucle while que pruebe valores

        //   hasta encontrar una puerta válida (≠ eleccion y ≠ premio).

        // - 'otraCerrada' es la única puerta que no es 'eleccion' ni 'abierta'.

        //

        // ------------------------------------------------------------

        // 🔁 OPCIONALES:

        // - Permitir cambiar el número de partidas (leer de args o Scanner).

        // - Mostrar resultados parciales cada 10 partidas.

        // - Añadir una estrategia "aleatoria" (a veces cambia, a veces no) y contar sus victorias.

        //

        // ============================================================

    }

}

