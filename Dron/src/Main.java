import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dr = new Scanner(System.in);


        System.out.println("Bateria Inicial");
        int bateria = dr.nextInt();
        int minutos = 0;


            if (bateria==0){
                System.out.println("Bateria agotada");
            } else {
                while (bateria>=7) {
                    bateria -= 7;
                    minutos++;

                    System.out.println("Minutos " + minutos + "-> bateria " + bateria + "%");
                }
            }
    }
}
