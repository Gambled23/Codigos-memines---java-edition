import java.util.Scanner;

public class pruebaOperadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero1, numero2, resultado;
        System.out.println("Digite 2 numeros: \n");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        //Suma
        resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
        //Resta
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
        //Multiplicacion
        resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
        //Division
        resultado = numero1 / numero2;
        System.out.println("El resultado de la divison es: " + resultado);
        //Mod
        resultado = numero1 % numero2;
        System.out.println("El residuo de la division es: " + resultado);
        entrada.close();
    }
}
