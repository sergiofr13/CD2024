
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        // Solicitar al usuario el segundo número
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Calcular la suma
        double suma = num1 + num2;

        // Imprimir el resultado
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);

        // Cerrar el escáner
        scanner.close();
    }
}
    

public class Suma {
    public static void main (String[] args) {
        double numero1 = Double.parseDouble(args[0]);
        double numero2 = Double.parseDouble(args[1]);

        double suma = numero1 + numero2;

        System.out.println(suma);
    }

    
}


