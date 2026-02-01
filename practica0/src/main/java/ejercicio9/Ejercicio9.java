package ejercicio9;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int[] numeros=new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Numero "+i);
            numeros[i]=scan.nextInt();
        }
        System.out.println("RESULTADOS");
        System.out.println("Valor mas alto: "+maximo(numeros));
        System.out.println("Valor mas bajo: "+minimo(numeros));
        System.out.println("Media muestral: "+mediaMuestral(numeros));
        scan.close();
    }

    public static int maximo(int[] array){
        int maximo=array[0];
        for(int num:array){
            if(num>maximo){
                maximo=num;
            }
        }
        return maximo;
    }

    public static int minimo(int[] array){
        int minimo=array[0];
        for(int num:array){
            if(num<minimo){
                minimo=num;
            }
        }
        return minimo;
    }

    public static double mediaMuestral(int[] array){
        int suma=0;
        int numElementos=0;
        for(int num:array){
            suma=suma+num;
            numElementos++;
        }
        return suma/numElementos;
    }
}
