import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int costointernet = 700000;
        int costoradio = 200000;
        int costotv = 600000;


        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;
        int votosInternet = 0, votosRadio = 0, votosTV = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Elecciones Municipio 'Premier' ---");
            System.out.println("1. Votar por un candidato");
            System.out.println("2. Ver total de votos");
            System.out.println("3. Ver porcentaje de votos por candidato");
            System.out.println("4. Calcular costos de campaña");
            System.out.println("5. Vaciar urnas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Votación
                    System.out.println("\nSeleccione el candidato:");
                    System.out.println("1. Candidato A");
                    System.out.println("2. Candidato B");
                    System.out.println("3. Candidato C");
                    int candidato = scanner.nextInt();

                    System.out.println("\n¿Cómo fue influenciado?");
                    System.out.println("1. Internet");
                    System.out.println("2. Radio");
                    System.out.println("3. Televisión");
                    int medio = scanner.nextInt();

                    // Contar votos
                    if (candidato == 1) votosCandidato1++;
                    else if (candidato == 2) votosCandidato2++;
                    else if (candidato == 3) votosCandidato3++;

                    // Contar influencia
                    if (medio == 1) votosInternet++;
                    else if (medio == 2) votosRadio++;
                    else if (medio == 3) votosTV++;

                    System.out.println("Voto registrado correctamente.");
                    break;

                case 2:
                    // Mostrar total de votos
                    int totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3;
                    System.out.println("\nTotal de votos: " + totalVotos);
                    break;

                case 3:
                    // Mostrar porcentaje de votos
                    int total = votosCandidato1 + votosCandidato2 + votosCandidato3;
                    if (total > 0) {
                        System.out.printf("\nCandidato A: %.2f%%\n", (votosCandidato1 * 100.0 / total));
                        System.out.printf("Candidato B: %.2f%%\n", (votosCandidato2 * 100.0 / total));
                        System.out.printf("Candidato C: %.2f%%\n", (votosCandidato3 * 100.0 / total));
                    } else {
                        System.out.println("\nAún no hay votos.");
                    }
                    break;

                case 4:
                    // Calcular costos de campaña
                    int costoTotalCandidato1 = votosCandidato1 * costointernet + votosCandidato1 * costoradio + votosCandidato1 * costotv;
                    int costoTotalCandidato2 = votosCandidato2 * costointernet + votosCandidato2 * costoradio + votosCandidato2 * costotv;
                    int costoTotalCandidato3 = votosCandidato3 * costointernet + votosCandidato3 * costoradio + votosCandidato3 * costotv;

                    System.out.println("\nCostos de campaña:");
                    System.out.println("Candidato A: $" + costoTotalCandidato1);
                    System.out.println("Candidato B: $" + costoTotalCandidato2);
                    System.out.println("Candidato C: $" + costoTotalCandidato3);
                    break;

                case 5:
                    // Vaciar urnas
                    votosCandidato1 = votosCandidato2 = votosCandidato3 = 0;
                    votosInternet = votosRadio = votosTV = 0;
                    System.out.println("Las urnas han sido vaciadas");
                    break;

                case 6:
                    // Salir
                    continuar = false;
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
