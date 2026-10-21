import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat fw = new DecimalFormat("#.##");
        System.out.println("Juego");
        double promedio=0;
        int acomulador=0;
        int pmd1000=0;
        int pc1000pom=0;
        for (int i = 1; i<8; i++) {
            System.out.println("Ingresa los puntos de partida "+i+":");
            int puntos= sc.nextInt();
            acomulador+=puntos;
            promedio=(double)puntos/i;

            if (puntos>=1000){
                pmd1000++;
            }else {
                pc1000pom++;}
        }

        System.out.println("-----------------------");
        System.out.println("  ");
        System.out.println("Puntos: "+acomulador);
        System.out.println("Promedio de puntos: "+fw.format(promedio));
        System.out.println("Promedio con mas de 1000 puntos: "+pmd1000);
        System.out.println("Promedio con menos o igual de 1000 puntos: "+pc1000pom);

    }
}