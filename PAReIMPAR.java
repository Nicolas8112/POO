import java.util.Scanner;

public class PAReIMPAR {

        public static void main (String [] arg){
            int cont=0, contador=0;
            int [] num= new int[10];

            System.out.print(" INGRESE 10  NUMEROS ");

            for (int i= 0; i<10; i++) {
                Scanner sc = new Scanner(System.in);
                num[i] = sc.nextInt();

                if (num[i]>=0){

                    cont++;
                }
                else if (num[i]<0){
                    contador++;
                }

            }

            System.out.println(" LOS NUMEROS POSITIVOS SON " + cont + "\n LOS NUMEROS NEGATIVOS SON "+ contador);
        }
    }
