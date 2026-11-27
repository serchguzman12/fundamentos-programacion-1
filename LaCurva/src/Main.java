public class Main {
    public static void main(String[] args) {
        int[] calificaciones = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};
        mostrarArreglo(calificaciones);
        aplicarCurva(calificaciones);
        mostrarArreglo(calificaciones);
        int aprobados=contarAprobados(calificaciones);
        System.out.println("Aprobados después de la curva "+aprobados);
        }
    public static void mostrarArreglo(int[] calificaciones){
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Alumno "+(i+1)+ ": " + calificaciones[i]);
        }
    }
    public static void aplicarCurva(int[] calificaciones){
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i]=calificaciones[i]+5;

            if (calificaciones[i]>100){
                calificaciones[i]=100;
            }
        }
    }
    public static int contarAprobados(int[] calificaciones){
        int contador=0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= 70){
                contador++;
            }
        }
        return contador;
    }
}

