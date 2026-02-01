package ejercicio4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Ejercicio4 {
    public static void main(String args[]) {
        double num1, num2, resultado = 0;
        char caracter;
        Scanner scan = new Scanner(System.in);

        /*FORMA FEA
        System.out.println("Escribe un numero");
        num1 = scan.nextDouble();
        System.out.println("Escribe otro numero");
        num2 = scan.nextDouble();
        System.out.println("Operacion(+,-,*,/): ");
        caracter = scan.next().charAt(0);
        switch (caracter) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                Predicate<Double> esCero=num -> num==0;
                if(esCero.test(num2)) System.out.println("El segundo numero no puede ser 0");
                resultado=esCero.test(num2)?Double.NaN:num1/num2;
                break;
            default:
                System.out.println("Opcion no valida!!");
                resultado = Double.NaN;
                break;
        }*/

        //FORMA BONITA
        Map<Character, BinaryOperator<Double>> operaciones=new HashMap<>();
        operaciones.put('+', (a, b)->a+b);
        operaciones.put('-', (a, b)->a-b);
        operaciones.put('*', (a, b)->a*b);
        operaciones.put('/', (a, b)->a/b);

        System.out.println("Escribe un numero: ");
        num1=scan.nextDouble();
        System.out.println("Escribe otro numero: ");
        num2=scan.nextDouble();
        System.out.println("Operacion(+,-,*,/): ");
        caracter=scan.next().charAt(0);

        resultado=operaciones.getOrDefault(caracter, (a, b)->Double.NaN).apply(num1, num2);

        if(caracter=='/' && num2==0){
            System.out.println("No se puede dividir por cero");
            resultado=Double.NaN;
        }
        System.out.println("Resultado es " + resultado);
        scan.close();
    }
}
