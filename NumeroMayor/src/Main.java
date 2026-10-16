import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nm= new Scanner(System.in);

        System.out.println("Limite 10 pisos");

        System.out.println("Piso actual");
        int piso = nm.nextInt();
        System.out.println("A que piso desea ir");
        int piso1 = nm.nextInt();

        System.out.println("---------");

        if (piso1 == 0){
            System.out.println("No puede ingresar cero");
        } else if (piso1 == piso){
            System.out.println("No puedes ir al mismo piso");
        } else if (piso1 >= 11){
            System.out.println("Limite 10 pisos");
        }else

        while (piso < piso1){
            piso++;
            System.out.println("Estas en el piso "+piso);
        }
        while (piso > piso1){
            piso--;
            System.out.println("Estas en el piso "+piso);
        }


    }
}