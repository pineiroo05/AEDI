package ejercicio3;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /* FORMA FEA
        System.out.println("Escribe un numero: ");
        double num=scan.nextDouble();
        
        if(num==0){
            System.out.println("El numero es cero \n El numero es par \n El numero es bajo");
        }else{
            System.out.println("El numero es distinto a cero");

            if(num%2==0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
            
            if(num<100){
                System.out.println("Numero bajo");
            }else{
                System.out.println("Numero elevado");
            }
            
        }*/

        //FORMA BONITA
        System.out.println("Escribe un numero: ");
        int numero=scan.nextInt();

        //Funciones lambda como dios manda
        Predicate<Integer> esPar = num -> num%2==0;
        Predicate<Integer> esCero = num -> num==0;
        Predicate<Integer> esElevado = num -> num>100;

        System.out.println(esPar.test(numero)?"Numero par":"Numero impar");
        System.out.println(esCero.test(numero)?"Es cero":"Distinto a cero");
        System.out.println(esElevado.test(numero)?"Numero elevado":"Numero bajo");
        scan.close();
    }
}
