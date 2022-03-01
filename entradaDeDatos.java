import java.util.Scanner;

public class entradaDeDatos {
    public static void main(String[] args) {
        //*Ints, doubles, strings, etc
        Scanner entrada = new Scanner(System.in); //Crear nuevo escaner
        float numero;
        System.out.print("Digite un valor: ");
        numero = entrada.nextFloat();
        System.out.println("El valor que digito es: " + numero);

        //*Chars
        char letra;
        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0); 
        /*Con next guarda la siguiente cadena que se meta al scanner, 
        pero al ponerle charAt te guarda la letra numero N de esa cadena*/
        System.out.println("La letra que digito es: " + letra);
        entrada.close(); //?Para cerrar el objeto y evitar el leak de recursos (No afecta al programa, pero es un warning)
    }
}
