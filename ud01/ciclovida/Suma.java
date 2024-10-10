
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
       
        double num1 = scanner.nextDouble();

        // Solicitar al usuario el segundo número
        
        double num2 = scanner.nextDouble();

        // Calcular la suma
        double suma = num1 + num2;

        // Imprimir el resultado
        System.out.println(suma);

        // Cerrar el escáner
        scanner.close();
    }
}
    



