import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tamaño de archivo en MB: ");
        double tamanodearchivo = sc.nextDouble();
        System.out.println("Ingrese velocidad de descarga en MB: ");
        double velocidaddescarga = sc.nextDouble();


        if (tamanodearchivo < 0 || velocidaddescarga <= 0) {
            System.out.println("Datos invalidos");
        } else {
            double tiempocalculado = calcularTiempo(tamanodearchivo, velocidaddescarga);
            System.out.println("Tiempo de descarga: " + tiempocalculado + " Segundos");
        }
    }

    public static double calcularTiempo(double tamanodearchivo, double velocidaddescarga) {
        return (tamanodearchivo / velocidaddescarga);
    }
}