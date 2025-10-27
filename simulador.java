import java.util.Random;
import java.util.Scanner;

class MontyHall {
    public static void main(String[] args) {

        ///
        int victoriasManteniendo = 0;
        int victoriasCambiando = 0;
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("¿Cuántas partidas quiere jugar? : ");
        System.out.println(">");
        int partidas = sc.nextInt();

        System.out.println("Bienvenido a MontyHall, ¿serás capaz de superar el desafío?");
        System.out.println("--------------------");
        System.out.println("Hay 3 puertas, de las cual, una de ella contiene un premio. Trata de adivinar donde se encuentra.");

        for (int i = 0; i < partidas; i++) {
            int puertaConPremio = (int) (Math.random() * 3);
            int puertaElegida = (int) (Math.random() * 3);

            int puertaAbierta;
            do {
                puertaAbierta = (int) (Math.random() * 3);
            } while (puertaAbierta == puertaElegida || puertaAbierta == puertaConPremio);
            int otraCerrada = 3 - puertaAbierta - puertaElegida;

            /// Estrategia mantener
            if (puertaElegida == puertaConPremio) {
                victoriasManteniendo++;
            }
            /// Estrategia cambiar
            if (otraCerrada == puertaConPremio) {
                victoriasCambiando++;
            }
        }

        /// Resúmen de estadísticas
        double pctMantener = (victoriasManteniendo * 100) / partidas; //OTRA OPCIÓN (double(victoriasmanteniendo) / partidas) * 100 
        double pctCambiar = (victoriasCambiando * 100) / partidas;    
        System.out.println("Partidas " + partidas);
        System.out.println("Victorias manteniendo: " + victoriasManteniendo + "," +  pctMantener);
        System.out.println("Victorias cambiando : " + victoriasCambiando + "," + pctCambiar);
    }
}
