import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Piedra, Papel o Tijera:");

        int PuntosJugador = 0;
        int PuntosPC = 0;
        int rondas = 0;

        while (rondas < 3 && PuntosJugador < 2 && PuntosPC < 2) {
            rondas++;
            System.out.println("--- Ronda" + rondas + "---");
            int SeleccionPC = (int) (Math.random() * 3) + 1;
            System.out.println("La computadora ya eligió.");

            System.out.println("Elige: piedra, papel o tijera (escribe un número del 1 al 3):" +
                    "1: Piedra" +
                    "2: Papel" +
                    "3: Tijera");
            int SeleccionUsuario = teclado.nextInt();

            System.out.print("El PC escogió: ");
            switch (SeleccionPC) {
                case 1 -> System.out.println("Piedra");
                case 2 -> System.out.println("Papel");
                case 3 -> System.out.println("Tijera");
            }
            if (SeleccionUsuario == SeleccionPC) {
                System.out.println("Empate");
            } else if ((SeleccionUsuario == 1 && SeleccionPC == 3) ||
                    (SeleccionUsuario == 2 && SeleccionPC == 1) ||
                    (SeleccionUsuario == 3 && SeleccionPC == 2)) {
                System.out.println("Ganaste esta ronda");
                PuntosJugador++;
            } else {
                System.out.println("La computadora ganó");
                PuntosPC++;
            }

            if (PuntosJugador == 2 || PuntosPC == 2) {
                break;
            }
        }


        System.out.println("Resultado Final:");
        System.out.println("Tus puntos:" + PuntosJugador);
        System.out.println("Puntos de la PC" + PuntosPC);

        if (PuntosJugador > PuntosPC) {
            System.out.println("Ganaste");
        } else {
            System.out.println("La computadora gana");
        }

        teclado.close();
    }
}
