import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        while (opcion == 1) {
            System.out.println("Ingrese porcentaje de bateria (0-100):");
            int porcentaje = sc.nextInt();

            while (porcentaje < 0 || porcentaje > 100) {
                System.out.println("Porcentaje invalido. Debe estar entre 0 y 100:");
                porcentaje = sc.nextInt();
            }

            int minutos = calcularMinutos(porcentaje);
            System.out.println("Minutos necesarios para cargar: " + minutos);

            System.out.println("Otra simulacion? (1 = si, 0 = no)");
            opcion = sc.nextInt();
        }

        System.out.println("Programa finalizado.");
    }

    static int calcularMinutos(int porcentajeInicial) {
        int minutos = 0;
        while (porcentajeInicial < 100) {
            porcentajeInicial += 8;
            minutos += 1;
        }
        return minutos;
    }
}