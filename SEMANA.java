import java.util.Scanner;

public class SEMANA {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int numeroSemana=0;


        System.out.println(" INGRESE un numero del 1 al 7");
        numeroSemana= keyboard.nextInt();

        switch (numeroSemana) {
            case 1: System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
        }

    }
}