import javax.swing.JOptionPane;
public class App {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    // Metodos

    public void pedirNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
    }
    public void sumarNumeros()
    {
        suma = numero1 + numero2;
    }
    public void restarNumeros()
    {
        resta = numero1 - numero2;
    }
    public void multiplicarNumeros()
    {
        multiplicacion = numero1 * numero2;
    }
    public void dividirNumeros()
    {
        division = numero1 / numero2;
    }
    public void mostrarResultados()
    {
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La division es: " + division);
    }
    public static void main(String[] args) {
        App objeto1 = new App();
        objeto1.pedirNumeros();
        objeto1.sumarNumeros();
        objeto1.restarNumeros();
        objeto1.multiplicarNumeros();
        objeto1.dividirNumeros();
        objeto1.mostrarResultados();
    }   
}
