package ejercicio7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Ejercicio7 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Ejercicio7 ej7=new Ejercicio7();
        ej7.menuBonito(scan);
    }

    public void menuBonito(Scanner scan){
        Map<Character, BinaryOperator<Double>> operaciones=new HashMap<>();
        operaciones.put('+', (a,b)->a+b);
        operaciones.put('-', (a,b)->a-b);
        operaciones.put('*', (a,b)->a*b);
        operaciones.put('/', (a,b)->a/b);

        double resultado=0;
        System.out.println("Escribe un numero");
        double num1=scan.nextDouble();
        System.out.println("Escribe otro numero");
        double num2=scan.nextDouble();
        System.out.println("Operacion(+,-,*,/): ");
        char caracter=scan.next().charAt(0);

        resultado=operaciones.getOrDefault(caracter, (a,b)->Double.NaN).apply(num1, num2);
        if(caracter=='/' && num2==0){
            System.out.println("No se puede dividir por cero");
            resultado=Double.NaN;
        }
        System.out.println("Resultado: "+resultado);
        confirmacion(scan);
        scan.close();
    }

    public void menu(Scanner scan){
        double resultado=0;
        System.out.println("Escribe un numero");
        double num1 = scan.nextDouble();
        System.out.println("Escribe otro numero");
        double num2 = scan.nextDouble();
        System.out.println("Operacion(+,-,*,/): ");
        char caracter = scan.next().charAt(0);
        switch (caracter) {
            case '+':
                resultado = num1+num2;
                break;
            case '-':
                resultado = num1-num2;
                break;
            case '*':
                resultado = num1*num2;
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
        }
        System.out.println("Resultado: "+resultado);
        confirmacion(scan);
        scan.close();
    }

    public void confirmacion(Scanner scan){
        System.out.println("Quieres hacer otra operacion?(s/n)");
        char caracter=scan.next().charAt(0);
        switch(caracter){
            case 's':
                menu(scan);
                break;
            case 'n':
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                confirmacion(scan);
                break;
        }
    }
}
