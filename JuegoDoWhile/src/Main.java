import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jd = new Scanner(System.in);
        int opc;
        int pts=100;

        do {
            System.out.println("Elige una opcion");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            opc= jd.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ganaste 20 puntos");
                    pts = pts + 20;
                    break;
                case 2:
                    System.out.println("Gastaste 15 puntos");
                    pts = pts - 15;
                    break;
                case 3:
                    System.out.println("Tus puntos son: "+ pts);
                    break;
                default:
                    System.out.println("Salir");
                    break;
            }
        }while(opc != 4);


    }
}