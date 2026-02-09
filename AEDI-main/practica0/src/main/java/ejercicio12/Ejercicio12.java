package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[][] matriz=new int[3][3];
        System.out.println("Intrduce los numeros para mi matriz 3x3");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++) {
                System.out.print("- Posicion["+i+"]["+j+"]: ");
                matriz[i][j]=scan.nextInt();
            }
        }

        System.out.print("\nIntroduce el numero a buscar: ");
        int num=scan.nextInt();

        int fila=-1;
        int col=-1;
        boolean encontrado=false;

        for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz.length && !encontrado; j++) {
                if(matriz[i][j]==num){
                    encontrado = true;
                    fila=i;
                    col=j;
                }
            }
        }

        if(encontrado){
            System.out.println("El numero esta en la fila "+fila+", columna "+col);
        }else{
            System.out.println("El numero no esta contenido");
        }

        scan.close();
    }
}
