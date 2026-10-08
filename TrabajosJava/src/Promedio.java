import java.util.Scanner;
public class Promedio {
    public static void main (String[] args){
        Scanner po = new Scanner(System.in);
        System.out.println("Ingrese promedio");
        double promedio = po.nextDouble();
        System.out.println("Ingrese asistencias");
        double asistencia= po.nextDouble();

        if (promedio < 7){
            System.out.println("Reprobado por promedio");
        } else if (asistencia < 80) {
            System.out.println("Reprobado por asistencia");
        } else  {
            System.out.println("Aprobo regular");
        }
    }
}
