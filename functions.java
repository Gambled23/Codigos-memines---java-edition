import javax.swing.JOptionPane;

public class functions {
    public static void main(String[] args) {
        int numeroUno, numeroDos;
        int resultado;
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero uno"));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero dos"));
        resultado = sumar(numeroUno, numeroDos);
        JOptionPane.showMessageDialog(null, "El resultado de la suma es " + resultado);
        resultado = restar(numeroUno, numeroDos);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es " + resultado);
        resultado = multiplicar(numeroUno, numeroDos);
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es " + resultado);
        resultado = dividir(numeroUno, numeroDos);
        JOptionPane.showMessageDialog(null, "El resultado de la division es " + resultado);
    }

    static int sumar(int num1, int num2) {
        int resultado;
        resultado = num1 + num2;
        return resultado;
    }
    static int restar(int num1, int num2) {
        int resultado;
        resultado = num1 - num2;
        return resultado;
    }
    static int multiplicar(int num1, int num2) {
        int resultado;
        resultado = num1 * num2;
        return resultado;
    }
    static int dividir(int num1, int num2) {
        int resultado;
        resultado = num1 / num2;
        return resultado;
    }
}
