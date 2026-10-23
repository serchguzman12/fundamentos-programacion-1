import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estacionamiento");

        int autosatendidos = 0;
        int acomulador = 0;
        int autosdescuento = 0;
        System.out.println("Ingrese horas: ");
        int hrs = sc.nextInt();
        while (hrs != 0) {
            if (hrs<=0) {
                System.out.println("Horas invalidas");
            } else {
                autosatendidos++;

                int pago = hrs * 15;
                if (hrs>5) {
                    pago = pago - 10;
                    autosdescuento++;
                    System.out.println("El auto paga con descuento: $" + pago);
                } else{
                    System.out.println("Sin descuento: $"+pago);
                }
                acomulador=acomulador+pago;
            }
            System.out.println("Ingrese horas: ");
            hrs=sc.nextInt();
        }

        if (autosatendidos>0){
            double promedio=(double)acomulador/autosatendidos;
            System.out.printf("Promedio: $%.2f%n", promedio);
            System.out.println("Total de autos: "+autosatendidos);
            System.out.println("Dinero acumulado: "+acomulador);
            System.out.println("Autos con descuento: "+autosdescuento);

        }else
            System.out.println("No se atendieron autos");


    }
}