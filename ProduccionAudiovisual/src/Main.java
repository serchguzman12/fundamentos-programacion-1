import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese tarifa: ");
        double tarifa = sc.nextDouble();
        System.out.println("Ingrese cantidad de horas: ");
        int hrs = sc.nextInt();
        if (tarifa<=0 || hrs<=0){
            System.out.println("La tarifa y las horas deben ser mayores que cero");
        }else {
            double total=calcularRenta(tarifa, hrs);
            mostrarComprobante(total);
        }
        sc.close();
    }
    static double calcularRenta(double tarifaAlquiler, int cantidadHoras){
        double total=tarifaAlquiler*cantidadHoras;
        return total;
    }
    static void mostrarComprobante(double total){
        System.out.println("Total: $"+total);
    }
}