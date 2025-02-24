import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alcancia alcancia = new Alcancia();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1.Agregar");
            System.out.println("2.Contar");
            System.out.println("3.total ahorrado");
            System.out.println("4.Romper alcancía");
            System.out.println("5.Salir");
            System.out.print("Ingrese la opcion:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor");
                    int cantidad = scanner.nextInt();
                    alcancia.agregarMoneda(cantidad);
                    break;
                case 2:
                    alcancia.contarMonedas();
                    break;
                case 3:
                    System.out.println("Total ahorrado:" + alcancia.calcularTotal());
                    break;
                case 4:
                    alcancia.romperAlcancia();
                    break;
                case 5:
                    System.out.println("Gracias por usar");
                    break;
                default:
                    System.out.println("Opción no válida.intentelo otra vez");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

class Alcancia {
    private int totalAhorrado;
    private int monedas20, monedas50, monedas100, monedas200, monedas500;


    public Alcancia() {
        totalAhorrado = 0;
        monedas20 = monedas50 = monedas100 = monedas200 = monedas500 = 0;
    }

    //Agregar
    public void agregarMoneda(int cantidad) {
        switch (cantidad) {
            case 20:
                monedas20++;
                break;
            case 50:
                monedas50++;
                break;
            case 100:
                monedas100++;
                break;
            case 200:
                monedas200++;
                break;
            case 500:
                monedas500++;
                break;
            default:
                System.out.println("Error, no existe esa moneda,de nuevo.");
                return;
        }
        totalAhorrado += cantidad;
        System.out.println("Moneda de: " + cantidad + " Agregada ");
    }

    public void contarMonedas() {
        System.out.println("Monedas guardadas:");
        System.out.println("$20: " + monedas20);
        System.out.println("$50: " + monedas50);
        System.out.println("$100: " + monedas100);
        System.out.println("$200: " + monedas200);
        System.out.println("$500: " + monedas500);
    }

    public int calcularTotal() {
        return totalAhorrado;
    }

    public void romperAlcancia() {
        System.out.println("en total hay:" + totalAhorrado);
        totalAhorrado = 0;
        monedas20 = monedas50 = monedas100 = monedas200 = monedas500 = 0;
    }
}
