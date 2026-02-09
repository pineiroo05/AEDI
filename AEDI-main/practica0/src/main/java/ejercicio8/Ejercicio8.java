package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]){
        char arrayLetras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner scan=new Scanner(System.in);
        System.out.println("Escribe tu numero de dni sin la letra");
        int numDni=scan.nextInt();
        System.out.println("Tu letra es "+arrayLetras[numDni%23]);
        scan.close();
    }
}
