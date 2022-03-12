import java.util.Scanner;

public class salarioCarros {
    public static void main(String[] args) {
        double salarioFinal = 0;
        int carrosVendidos;
        double aux1;
        double aux2 = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos carros vendiste? ");
        carrosVendidos = entrada.nextInt();
        int i = 0;
        while (i < carrosVendidos) {
            System.out.println("Cual es el precio del carro " + (i + 1) + "?");
            aux1 = entrada.nextDouble();
            aux1 = aux1 * 0.05;
            aux2 = aux2 + aux1;
            i++;
        }
        salarioFinal = 1000 + (150 * carrosVendidos) + aux2;
        System.out.println("Tu salario final es de: $" + salarioFinal);
        entrada.close();
    }
}
