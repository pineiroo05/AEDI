package ejercicio5;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Ejercicio5 {
    public static void main(String args[]){
        int numero, resultado=0;
        Scanner scan=new Scanner(System.in);
        
        Predicate<Integer> menorCero=num -> num<0;
        do{
            System.out.println("Escribe un numero");
            numero=scan.nextInt();
        }while(menorCero.test(numero));

        /*for(int i=0; i<numero; i++){
            resultado=resultado+i;
        }*/
        resultado=IntStream.range(0, numero).sum();
        
        System.out.println("Resultado: "+resultado);
        scan.close();
    }
}
