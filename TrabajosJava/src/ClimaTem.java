import java.util.Scanner;
public class ClimaTem {

        public  static void main(String[] args){
            Scanner teclado = new Scanner (System.in);

            System.out.println("Ingrese la temperatura en grados C: ");
            int grados= teclado.nextInt();

            if (grados < 10){
                System.out.println("Frio extremo");
            }else if (grados <= 20) {
                System.out.println("Clima fresco");
            }else if (grados <= 30){
                System.out.println("Clima Agradable");
            }else{
                System.out.println("Calor extremo");
            }
        }
    }
