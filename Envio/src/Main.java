import java.util.Scanner;

public class Main {
    public static void mostrarEtiquetas(int numeroGuia, String destino, double peso) {
        System.out.println("=============================");
        System.out.println("      ETIQUETA DE ENVIO      ");
        System.out.println("=============================");
        System.out.println("Número de guia: "+numeroGuia);
        System.out.println("Destino:        "+destino);
        System.out.println("Peso            "+peso+"kg");
        System.out.println("=============================");
        System.out.println();
    }

    public static void main(String[] args) {
        mostrarEtiquetas(1001, "Cuernavaca", 2.5);
        mostrarEtiquetas(1002, "Guadalajara", 10.0);
        mostrarEtiquetas(1003, "Monterrey", 0.75);
    }
}