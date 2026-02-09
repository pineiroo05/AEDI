package ejercicio9;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int[] numeros=new int[10];
        for(int i=0; i<numeros.length; i++){
            System.out.print("Numero "+(i+1)+": ");
            numeros[i]=scan.nextInt();
        }
        System.out.println("\nRESULTADOS");
        System.out.println("Valor maximo: "+maximo(numeros));
        System.out.println("Valor minimo: "+minimo(numeros));
        System.out.println("Valor medio: "+mediaMuestral(numeros));
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
