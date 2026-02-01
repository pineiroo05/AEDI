package ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Numero de estudiantes");
        int nfilas=scan.nextInt();
        System.out.println("Notas por estudiante");
        int ncols=scan.nextInt();

        double[][] matrizNotas=new double[nfilas][ncols];
        rellenarMatriz(matrizNotas, scan);
    }

    public static void rellenarMatriz(double[][] matriz, Scanner scan){
        for(int i=0; i<matriz.length; i++){
            System.out.println("Alumno "+i);
            for(int j=0; j<matriz.length; j++){
                System.out.println("Nota "+j);
                matriz[i][j]=scan.nextDouble();
            }
        }
        sacarContenido(matriz);
    }

    public static void sacarContenido(double[][] matriz){
        for(int i=0; i<matriz.length; i++){
            System.out.println("Alumno "+i);
            for(int j=0; j<matriz.length; j++){
                System.out.println("Nota "+i+": "+matriz[i][j]);
            }
        }
    }
}
